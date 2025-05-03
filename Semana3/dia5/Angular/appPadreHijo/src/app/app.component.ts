import { Component } from '@angular/core';
import { Router, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'appPadreHijo';

  constructor(private router : Router ){}

  //metds de navegacin para compoonentes Padre
  listarP(){
    this.router.navigate(['listarP']);
  }
  guardarP(){
    this.router.navigate(['guardarP']);
  }
  editarP(){
    this.router.navigate(['editarP']);
  }
  //metdos para HIJO
  listarH(){
    this.router.navigate(['listarH']);
  }
  guardarH(){
    this.router.navigate(['guardarH']);
  }
  editarH(){
    this.router.navigate(['editarH']);
  }


}
