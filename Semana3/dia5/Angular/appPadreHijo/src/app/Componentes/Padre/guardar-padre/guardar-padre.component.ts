import { Component } from '@angular/core';
import { Padre } from '../../../Entidades/Padre';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { ServiceWSService } from '../../../Service/service-ws.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-guardar-padre',
  imports: [FormsModule],
  templateUrl: './guardar-padre.component.html',
  styleUrl: './guardar-padre.component.css'
})
export class GuardarPadreComponent {
  constructor(private router : Router, private service : ServiceWSService){}

  padre : Padre = new Padre();

  guardar(){
    this.service.guardarWS(this.padre).subscribe(data =>{
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
