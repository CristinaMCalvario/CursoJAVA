import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceWSService } from '../../../Service/service-ws.service';
import { Hijo } from '../../../Entidades/Hijo';
import { JsonPipe } from '@angular/common';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-listar-hijo',
  imports: [],
  templateUrl: './listar-hijo.component.html',
  styleUrl: './listar-hijo.component.css'
})
export class ListarHijoComponent implements OnInit{
  constructor(private router : Router, private service : ServiceWSService){

  }
  hijo : Hijo = new Hijo();
  hijos !: Hijo[];

  ngOnInit(): void {
    this.listarHijo();
  }
  listarHijo(){
    this.service.listarHWS().subscribe(data =>{
      this.hijos =  data
      console.log('listado exitoso',JSON.stringify(data));
    })
  }
  editarButton(hijo: Hijo){
    localStorage.setItem('hijo',JSON.stringify(hijo));
    console.log(localStorage);
    this.router.navigate(['editarH']);
  }

  eliminarButton(hijo : Hijo){
    Swal.fire({
          title: "seguro que quiere eliminar el id: "+ hijo.idHijo +" ?",
          text: "Este moviento no se puede revertir",
          icon: "warning",
          showCancelButton: true,
          confirmButtonColor: "#3085d6",
          cancelButtonColor: "#d33",
          confirmButtonText: "Si, eliminalo!"
        }).then((result) => {
          if (result.isConfirmed) {
            this.service.eliminarHWS(hijo).subscribe(data =>{
              Swal.fire({
                title: "Eliminado!",
                text: JSON.stringify(data),
                icon: "success"
              });
              console.log(JSON.stringify(data));
              this.listarHijo();
            });
           
          }else if(result.isDenied){
            Swal.fire("La eliminacion fue cancelada","",'info');
          }
        });
    
  }

}
