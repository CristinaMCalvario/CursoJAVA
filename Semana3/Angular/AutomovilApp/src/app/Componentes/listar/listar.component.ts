import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceWSService } from '../../Service/service-ws.service';
import { Automovil } from '../../Entidad/Automovil';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-listar',
  imports: [],
  templateUrl: './listar.component.html',
  styleUrl: './listar.component.css'
})
//OnInit es una interfaz de angular que define el metodo ngOnInit el cual se ejecuta cuando el componente se inicializa
//
export class ListarComponent implements OnInit {
  //agregar un constructor de la clave  para inyectar depemdecias
  constructor(private router : Router, private service : ServiceWSService){}

  automovil : Automovil = new Automovil();
  autmoviles !: Automovil[];


  ngOnInit(): void {
    this.listarAutomoviles();
  }

  listarAutomoviles(){
    this.service.listarAWS().subscribe(data =>{
      this.autmoviles = data
      console.log('listado exitosoo' + JSON.stringify(data));
    })
  }

  editarButtom(automovil : Automovil){
    localStorage.setItem('automovil',JSON.stringify(automovil));
    console.log(localStorage)
    this.router.navigate(['editarA']);
  }

  eliminarButtom(automovil : Automovil){
    Swal.fire({
      title: "seguro que quiere eliminar el id: "+ automovil.idAutomovil+" ?",
      text: "Este moviento no se puede revertir",
      icon: "warning",
      showCancelButton: true,
      confirmButtonColor: "#3085d6",
      cancelButtonColor: "#d33",
      confirmButtonText: "Si, eliminalo!"
    }).then((result) => {
      if (result.isConfirmed) {
        this.service.eliminarWS(automovil).subscribe(data =>{
          Swal.fire({
            title: "Eliminado!",
            text: "Tu registro fue eliminado.",
            icon: "success"
          });
          this.listarAutomoviles();
        });
       
      }else if(result.isDenied){
        Swal.fire("La eliminacion fue cancelada","",'info');
      }
    });

  }


}
