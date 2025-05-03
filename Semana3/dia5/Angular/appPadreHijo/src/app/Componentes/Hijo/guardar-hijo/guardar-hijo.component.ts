import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { ServiceWSService } from '../../../Service/service-ws.service';
import { Hijo } from '../../../Entidades/Hijo';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-guardar-hijo',
  imports: [FormsModule],
  templateUrl: './guardar-hijo.component.html',
  styleUrl: './guardar-hijo.component.css'
})
export class GuardarHijoComponent {
  constructor(private router :  Router, private service : ServiceWSService){}

  hijo : Hijo = new Hijo();

  guardarHijo(){
    this.service.guardarHWS(this.hijo).subscribe(data =>{
      Swal.fire({
              icon: "success",
              title: "GUARDAR",
              text: JSON.stringify(data),
              showConfirmButton: false,
              timer: 2100
            });
      console.log(JSON.stringify(data));
      this.router.navigate(['guardarP']);
    },error =>{
      Swal.fire({
              icon: "error",
              title: "Guardar",
              text: "Ocurrio un error al guardar",
              showConfirmButton: false,
              timer: 1500
            });
            console.log(JSON.stringify(error));
    })
  }

}
