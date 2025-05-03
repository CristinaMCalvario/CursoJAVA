import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Padre } from '../../../Entidades/Padre';
import { Router } from '@angular/router';
import { ServiceWSService } from '../../../Service/service-ws.service';
import { JsonPipe } from '@angular/common';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-editar-padre',
  imports: [FormsModule],
  templateUrl: './editar-padre.component.html',
  styleUrl: './editar-padre.component.css'
})
export class EditarPadreComponent implements OnInit{
  constructor(private router: Router,private service : ServiceWSService){}
  padre : Padre = new Padre();

  ngOnInit(): void {
    this.buscarPadre();
  }

  buscarPadre(){
    const padreString = localStorage.getItem('padre');
    if (padreString) {
      console.log(JSON.parse(padreString));
      this.padre = JSON.parse(padreString);
    }
    this.service.buscarWS(this.padre).subscribe(data=>{
      this.padre = data;
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

  /* editar(){
    this.service.editarWS(this.padre).subscribe(data =>{
      Swal.fire({
        icon: "success",
        title: "EDITAR",
        text: JSON.stringify(data),
        showConfirmButton: false,
        timer: 2100
      });
      console.log(JSON.stringify(data));
      this.router.navigate(['listarP']);
    },error=>{
      Swal.fire({
        icon: "error",
        title: "Editar",
        text: "Ocurrio un error al guardar",
        showCancelButton: false,
        timer: 1500
      });
      //console.log(JSON.stringify(error));
    })
  }
 */
  editar() {
    this.service.editarWS(this.padre).subscribe({
      next: (response: string) => {
        Swal.fire({
          icon: "success",
          title: "ACTUALIZACIÓN EXITOSA",
          text: response,  // Usamos la respuesta directa del servidor
          showConfirmButton: false,
          timer: 2100
        });
        this.router.navigate(['listarP']);
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
  
}
