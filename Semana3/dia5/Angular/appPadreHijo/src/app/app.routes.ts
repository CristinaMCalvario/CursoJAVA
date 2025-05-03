import { Routes } from '@angular/router';
import { ListarHijoComponent } from './Componentes/Hijo/listar-hijo/listar-hijo.component';
import { GuardarHijoComponent } from './Componentes/Hijo/guardar-hijo/guardar-hijo.component';
import { ListarPadreComponent } from './Componentes/Padre/listar-padre/listar-padre.component';
import { GuardarPadreComponent } from './Componentes/Padre/guardar-padre/guardar-padre.component';
import { EditarPadreComponent } from './Componentes/Padre/editar-padre/editar-padre.component';
import { EditarHijoComponent } from './Componentes/Hijo/editar-hijo/editar-hijo.component';

export const routes: Routes = [
    {path: 'listarP',component : ListarPadreComponent},
    {path: 'guardarP',component : GuardarPadreComponent},
    {path: 'editarP',component : EditarPadreComponent},

    //paths de hijos
    {path: 'listarH', component: ListarHijoComponent},
    {path: 'guardarH',component: GuardarHijoComponent},
    {path: 'editarH',component : EditarHijoComponent}
];
