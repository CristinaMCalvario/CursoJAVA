import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Padre } from '../Entidades/Padre';
import { Observable } from 'rxjs';
import { Hijo } from '../Entidades/Hijo';

@Injectable({
  providedIn: 'root'
})
export class ServiceWSService {

  constructor(private http : HttpClient) { }

url = 'http://localhost:8001/api';

//declaracio de metods para consumir los contrladores de caa de parte del padre
listarWS(){
  return this.http.get<Padre[]>(this.url + "/Padre/listar");
}
guardarWS(padre : Padre){
  return this.http.post<String>(this.url + "/Padre/guardar",padre, {responseType: "text" as "json"});
}
/* editarWS(padre : Padre){
  return this.http.put<String>(this.url + "/Padre/editarP",padre,{responseType: "text" as "json"});
} */
  editarWS(padre: Padre): Observable<string> {
    return this.http.put(
      `${this.url}/Padre/editar`, 
      padre,
      { 
        responseType: 'text',
        headers: new HttpHeaders({
          'Content-Type': 'application/json'
        })
      }
    );
  }
buscarWS(padre : Padre){
  return this.http.post<Padre>(this.url + "/Padre/buscar",padre);
}
eliminarWS(padre : Padre):Observable<void>{
  return this.http.delete<void>(this.url + "/Padre/eliminar",{body: padre, responseType: "text" as "json"});
}

//HIJO
listarHWS(){
  return this.http.get<Hijo[]>(this.url + "/Hijo/listar");
}
guardarHWS(hijo : Hijo){
  return this.http.post<String>(this.url + "/Hijo/guardar", hijo, {responseType: "text" as "json"});
}
/* editarHWS(hijo : Hijo){
  const headers = new HttpHeaders({
    'Content-Type': 'application/json'
  });
  return this.http.put<String>(this.url + "/Hijo/editar" + hijo,{headers: headers ,responseType: "text" as "json"});
} */
  editarHWS(hijo : Hijo): Observable<string> {
    return this.http.put(
      `${this.url}/Hijo/editar`, 
      hijo,
      { 
        responseType: 'text',
        headers: new HttpHeaders({
          'Content-Type': 'application/json'
        })
      }
    );
  }
buscarHWS(hijo : Hijo){
  return this.http.post<Hijo>(this.url + "/Hijo/buscar" , hijo);
}
eliminarHWS(hijo : Hijo){
  return this.http.delete<void>(this.url + "/Hijo/eliminar",{body: hijo, responseType: "text" as "json"});
}



}
