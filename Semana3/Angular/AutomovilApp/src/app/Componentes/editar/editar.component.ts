import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { ServiceWSService } from '../../Service/service-ws.service';
import { Automovil } from '../../Entidad/Automovil';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-editar',
  imports: [FormsModule],
  templateUrl: './editar.component.html',
  styleUrl: './editar.component.css'
})
export class EditarComponent implements OnInit {

  constructor(private router : Router, private service : ServiceWSService){}

  automovil : Automovil = new Automovil();

  ngOnInit(): void {
    this.buscarAutomovil();
  }
buscarAutomovil(){
  const automovilString = localStorage.getItem('automovil');
  if(automovilString){
    console.log(JSON.parse(automovilString));
    this.automovil =  JSON.parse(automovilString);
  }
  this.service.buscarWS(this.automovil).subscribe(data =>{
    this.automovil = data;
    Swal.fire({
      icon: "success",
      title: "EDITAR",
      text: "Informacion cargada",
      showConfirmButton: false,
      timer: 2100
    });
  },error =>{
    Swal.fire({
      icon: "error",
      title: "Editar",
      text: "ocurrioo un error",
      confirmButtonText: "OK"
    });
  })
}


editarAutomovil(){
  this.service.editarWS(this.automovil).subscribe(data =>{
    Swal.fire({
      icon: "success",
      title: "EDITAR",
      text: "Edicion exitosa",
      showConfirmButton: false,
      timer: 2100
    });
    this.router.navigate(['listarA']);
  })
}





}

