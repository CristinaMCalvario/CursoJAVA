import { Component } from '@angular/core';
import { Router, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'AutomovilApp';

//constructor
constructor(private router : Router){

}
//funciones para navegar a los componentes
listarA(){
  this.router.navigate(['listarA']);

}
guardarA(){
  this.router.navigate(['guardarA']);
}
editarA(){
  this.router.navigate(['editarA']);
}







}
