import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Automovil } from '../Entidad/Automovil';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
//este es archivo es mi nuevo cliente quien consume mi contrlador en el banckend
export class ServiceWSService {
//inyeccin de dependencias del constructor
  constructor(private http: HttpClient ) { }

//cnfiguracioon del la url del WS que consume
url = 'http://localhost:8080/api/Automovil';

//declaracion del metodo para consumir los controladores del backend
listarAWS(){
  return this.http.get<Automovil[]>(this.url + "/listar");
}
guardarWS(automovil :Automovil){
  return this.http.post<String>(this.url + "/guardar", automovil);
}
editarWS(automovil : Automovil){
  return this.http.put<String>(this.url + "/editar", automovil);
}
eliminarWS(automovil : Automovil): Observable<void>{
  return this.http.delete<void>(this.url + "/eliminar", {body: automovil});
}

buscarWS(automovil : Automovil){
  return this.http.post<Automovil>(this.url + '/buscar' , automovil);
}




}
