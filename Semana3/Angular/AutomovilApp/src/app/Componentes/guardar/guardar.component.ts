import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { ServiceWSService } from '../../Service/service-ws.service';
import { Automovil } from '../../Entidad/Automovil';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-guardar',
  imports: [FormsModule],
  templateUrl: './guardar.component.html',
  styleUrl: './guardar.component.css'
})
export class GuardarComponent {

  constructor(private router : Router, private service : ServiceWSService){

  }

  automovil : Automovil = new Automovil();

  guardarA(){
    this.service.guardarWS(this.automovil).subscribe(data => {
      Swal.fire({
        
        icon: "success",
        title: "Guardar",
        text: "El registro se aguardo con exito",
        showConfirmButton: false,
        timer: 2000
      });
      console.log(JSON.stringify(data));
      this.router.navigate(['listarA']);

    }, error=>{
      Swal.fire({
        icon: "error",
        title: "GUARDAR",
        text: "Ocurrio un error",
        confirmButtonText: 'OK'
      });
      console.log(JSON.stringify(error))
    })
  }

}
