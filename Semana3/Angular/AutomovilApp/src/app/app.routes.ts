import { Routes } from '@angular/router';
import { ListarComponent } from './Componentes/listar/listar.component';
import { GuardarComponent } from './Componentes/guardar/guardar.component';
import { EditarComponent } from './Componentes/editar/editar.component';

export const routes: Routes = [
    {path: 'listarA',component : ListarComponent},
    {path: 'guardarA',component : GuardarComponent},
    {path: 'editarA',component : EditarComponent}
];



