import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ServiceWSService } from '../../../Service/service-ws.service';
import { Router } from '@angular/router';
import { Hijo } from '../../../Entidades/Hijo';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-editar-hijo',
  imports: [FormsModule],
  templateUrl: './editar-hijo.component.html',
  styleUrl: './editar-hijo.component.css'
})
export class EditarHijoComponent implements OnInit{
  constructor(private router : Router, private service :ServiceWSService){}
  hijo : Hijo =  new Hijo();

  ngOnInit(): void {
    this.buscarHijo();
  }
  buscarHijo(){
     const hijoString = localStorage.getItem('hijo');
        if (hijoString) {
          console.log(JSON.parse(hijoString));
          this.hijo = JSON.parse(hijoString);
        }
        this.service.buscarHWS(this.hijo).subscribe(data=>{
          this.hijo = data;
          console.log('buscar exito',JSON.stringify(data));
          Swal.fire({
            icon: "success",
            title:"EDITAR",
            text: "Informacion cargada",
            showConfirmButton: false,
            timer: 2100
          });
          console.log('buscar exito',JSON.stringify(data));
        },error =>{
          Swal.fire({
            icon:"error",
            title:"Editar",
            text: "ocurrio un error buscar",
            showConfirmButton: false,
            timer: 1500
          });
          console.log(JSON.stringify(error));
        })
  }
  editarHijo() {
      this.service.editarHWS(this.hijo).subscribe({
        next: (response: string) => {
          Swal.fire({
            icon: "success",
            title: "ACTUALIZACIÓN EXITOSA",
            text: response,  // Usamos la respuesta directa del servidor
            showConfirmButton: false,
            timer: 2100
          });
          this.router.navigate(['listarH']);
        },
        error: (error) => {
          let errorMsg = "Ocurrió un error al guardar";
          
          if (error.status === 0) {
            errorMsg = "Error de conexión con el servidor";
          } else if (error.error) {
            errorMsg = error.error;
          }
    
          Swal.fire({
            icon: "error",
            title: "ERROR",
            text: errorMsg,
            showConfirmButton: true,
            timer: 3000
          });
          
          console.error("Error completo:", error);
        }
      });
    }
  /* editarHijo(){
    this.service.editarHWS(this.hijo).subscribe(data =>{
      Swal.fire({
        icon: "success",
        title: "EDITAR",
        text: JSON.stringify(data),
        showConfirmButton: false,
        timer: 2100
      });
      console.log(JSON.stringify(data));
      this.router.navigate(['listarH']);
    },error => {
      Swal.fire({
        icon: "error",
        title: "Guardar",
        text: "Ocurrio un error al guardar",
        showConfirmButton: false,
        timer: 1500
      });
      console.log(JSON.stringify(error));
    })
  } */

}
