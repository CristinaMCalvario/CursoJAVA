import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { ServiceWSService } from '../../Service/service-ws.service';
import { Persona } from '../../Entidad/Persona';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-editar',
  imports: [FormsModule],
  templateUrl: './editar.component.html',
  styleUrl: './editar.component.css'
})
export class EditarComponent {
  constructor(private router : Router, private service : ServiceWSService){}

  isLoading = false;
  isEditing = false;
  persona : Persona = new Persona();

  ngOnInit(): void {
    this.buscarPersona();
  }

  buscarPersona(){
    const personaString = localStorage.getItem('persona');
    if (!personaString) return;

    try {
      this.isLoading = true;
      const personaBusqueda = JSON.parse(personaString) as Persona;
      
      this.service.buscarWS(personaBusqueda).subscribe({
        next: (data) => {
          this.persona = data;
          this.isEditing = true;
          Swal.fire('Exito', 'Datos cargados correctamente', 'success');
        },
        error: (err) => this.handleError('Error al buscar persona', err)
      });
    } catch (e) {
      this.handleError('Error en datos locales', e);
    } finally {
      this.isLoading = false;
    }
    
  }

  editarPersona(){
    this.service.editarWS(this.persona).subscribe({
      next: (response) => {
        if (response.status === 200) {
          Swal.fire({
            icon: 'success',
            title: 'Actualización exitosa',
            text: response.body || 'Persona actualizada correctamente',
            timer: 2000
          });
          //this.router.navigate(['listarP']);
          this.router.navigate(['listarP']);
        }//if
      },
      error: (error) =>{
        if (error.type == 'validation') {
          let errorMessages = '';
          for (const field in error.errors) {
            errorMessages += `<b>${field}:</b> ${error.errors[field]}<br>`;
          }
          Swal.fire({
            icon: 'error',
            title: 'Errores de validación',
            html: errorMessages
          });
        }else{
          Swal.fire({
            icon: 'error',
            title: 'Error',
            text: error.message || 'Error al actualizar la persona'
          });
        }
      }
    });//suscribe
  }

  // Helpers
  private handleError(context: string, error: any) {
    this.isLoading = false;
    console.error(context, error);

    let message = error.message || 'Error desconocido';
    if (error.type === 'validation') {
      message = Object.values(error.errors).join('\n');
    }

    Swal.fire('Error', message, 'error');
  }

}
