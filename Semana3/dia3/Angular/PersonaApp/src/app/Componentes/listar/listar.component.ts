import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceWSService } from '../../Service/service-ws.service';
import { Persona } from '../../Entidad/Persona';
import Swal from 'sweetalert2';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-listar',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './listar.component.html',
  styleUrl: './listar.component.css'
})
export class ListarComponent implements OnInit{
  constructor(private router : Router, private service : ServiceWSService){}

  persona : Persona = new Persona();
  personas !: Persona[];
  isLoading = true;

  ngOnInit(): void {
    this.listarPersonas();
  }
listarPersonas(){
  this.service.listarWS().subscribe({
    next: (data) => {
      this.personas = data;
      this.isLoading = false;
    },
    error: (err) => {
      this.isLoading = false;
      this.handleError(err);
    }
  });
}

editarButtom(persona : Persona){
  localStorage.setItem('persona',JSON.stringify(persona));
  console.log(localStorage)
  this.router.navigate(['editarP']);
}

eliminarButton(persona : Persona){
  Swal.fire({
    title: '¿Estás seguro?',
    text: `Vas a eliminar a ID: ${persona.idPersona} -> Nombre: ${persona.nombre}`,
    icon: 'warning',
    showCancelButton: true,
    confirmButtonColor: '#3085d6',
    cancelButtonColor: '#d33',
    confirmButtonText: 'Sí, eliminar',
    cancelButtonText: 'Cancelar'
  }).then((result) => {
    if (result.isConfirmed) {
      this.service.eliminarWS(persona).subscribe({
        next: (response) => {
          if (response.status === 200) {
            const successMessage = response.body?.message || 'Registro eliminado exitosamente';
            Swal.fire({
              icon: 'success',
              title: 'Eliminado',
              text: successMessage,
              timer: 2000
            });
              this.actualizarListado();
          }
        },
        error: (err) => {
          if (err.type === 'validation') {
            let errorMessages = '';
            for (const field in err.errors) {
              errorMessages += `<b>${field}:</b> ${err.errors[field]}<br>`;
            }
            Swal.fire({
              icon: 'error',
              title: 'Errores de validación',
              html: errorMessages
            });
          } else {
            Swal.fire({
              icon: 'error',
              title: 'Error',
              text: err.message || 'Error al eliminar el registro'
            });
          }
        }
      });
    }
  });
  
}
actualizarListado() {
  // Implementa la lógica para refrescar tu listado
  this.service.listarWS().subscribe(data => {
    this.personas = data;
  });
}
private handleError(error: any) {
  if (error.type === 'no-content') {
    Swal.fire({
      icon: 'info',
      title: 'Información',
      text: error.message,
      timer: 3000
    });
    this.personas = []; // Lista vacía
  } else {
    Swal.fire({
      icon: 'error',
      title: 'Error',
      text: error.message || 'Error al cargar los datos',
      timer: 3000
    });
  }
}

}
