import { Component } from '@angular/core';
import { Router, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  
  title = 'PersonaApp';

  constructor(private router : Router){}

  listarP(){
    this.router.navigate(['listarP']);
  }
  guardarP(){
    this.router.navigate(['guardarP']);
  }
  editarP(){
    this.router.navigate(['editarP'])
  }


}
