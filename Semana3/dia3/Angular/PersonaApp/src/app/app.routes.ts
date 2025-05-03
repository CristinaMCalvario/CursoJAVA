import { Routes } from '@angular/router';
import { ListarComponent } from './Componentes/listar/listar.component';
import { GuardarComponent } from './Componentes/guardar/guardar.component';
import { EditarComponent } from './Componentes/editar/editar.component';

export const routes: Routes = [
    {path: 'listarP', component : ListarComponent},
    {path: 'guardarP', component : GuardarComponent},
    {path: 'editarP', component : EditarComponent}
];
