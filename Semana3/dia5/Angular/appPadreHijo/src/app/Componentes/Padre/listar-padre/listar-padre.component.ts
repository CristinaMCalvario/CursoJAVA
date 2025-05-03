import { Component, OnInit } from '@angular/core';
import { ServiceWSService } from '../../../Service/service-ws.service';
import { Router } from '@angular/router';
import { Padre } from '../../../Entidades/Padre';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-listar-padre',
  imports: [],
  templateUrl: './listar-padre.component.html',
  styleUrl: './listar-padre.component.css'
})
export class ListarPadreComponent implements OnInit{
  constructor(private router : Router, private service : ServiceWSService){}
  padre : Padre =  new Padre();
  padres !: Padre[];

  ngOnInit(): void {
    this.listarPadre();
  }
  listarPadre(){
    this.service.listarWS().subscribe(data =>{
      this.padres = data
      console.log('listado exitoso',JSON.stringify(data));
    })
  }

  editarButton(padre : Padre){
    localStorage.setItem('padre',JSON.stringify(padre));
    console.log(localStorage);
    this.router.navigate(['editarP']);
  }

  eliminarButton(padre : Padre){
    Swal.fire({
      title: "seguro que quiere eliminar el id: "+ padre.idPadre +" ?",
      text: "Este moviento no se puede revertir",
      icon: "warning",
      showCancelButton: true,
      confirmButtonColor: "#3085d6",
      cancelButtonColor: "#d33",
      confirmButtonText: "Si, eliminalo!"
    }).then((result) => {
      if (result.isConfirmed) {
        this.service.eliminarWS(padre).subscribe(data =>{
          Swal.fire({
            title: "Eliminado!",
            text: JSON.stringify(data),
            icon: "success"
          });
          console.log(JSON.stringify(data));
          this.listarPadre();
        });
       
      }else if(result.isDenied){
        Swal.fire("La eliminacion fue cancelada","",'info');
      }
    });

  }



}
