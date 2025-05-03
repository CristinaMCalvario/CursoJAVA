import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { ServiceWSService } from '../../Service/service-ws.service';
import { Persona } from '../../Entidad/Persona';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-guardar',
  imports: [FormsModule],
  templateUrl: './guardar.component.html',
  styleUrl: './guardar.component.css'
})
export class GuardarComponent{
 
  constructor(private router : Router, private service : ServiceWSService){}

  persona : Persona = new Persona();
  

guardarP() {

  console.log('Datos a enviar:', JSON.stringify(this.persona));

  this.service.guardarWS(this.persona).subscribe({
    next: (response: any) => {
      console.log('Respuesta completa:', response);
      if (typeof response === 'string') {
        Swal.fire('Éxito', response, 'success');
      } else {
        Swal.fire('Éxito', 'Persona guardada correctamente', 'success');
      }
      this.router.navigate(['/listarP']); // Redirigir después de guardar
    },
    error: (error) => {
      console.error('Error completo:', error);
      let errorMessage = 'Ocurrió un error al guardar';
      
      if (error.error && typeof error.error === 'string') {
        errorMessage = error.error;
      } else if (error.message) {
        errorMessage = error.message;
      }
      
      Swal.fire('Error', errorMessage, 'error');
    }
  });
}
  

      
}//
