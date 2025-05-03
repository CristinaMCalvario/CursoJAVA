import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Persona } from '../Entidad/Persona';
import { catchError, Observable, throwError, map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiceWSService {

  constructor(private http : HttpClient) { }

  url = 'http://localhost:8080/api/Persona';

  listarWS():Observable<Persona[]>{
    return this.http.get<Persona[]>(this.url + "/listar").pipe(
      catchError(this.handleErrorL)
    );
  }
  guardarWS(persona : any): Observable<any>{

    console.log('Enviando datos:',persona); // Verifica en consola
    return this.http.post(this.url + "/guardar", persona,{
       headers: { 'Content-Type': 'application/json' },
      responseType: 'text'
    }
      
    );

  }

  editarWS(persona : Persona): Observable<any>{
    return this.http.put(this.url + "/editar", persona,
      {
        headers: { 'Content-Type': 'application/json' },
        observe: 'response',
        responseType: 'text'
      }
    ).pipe(
      catchError(this.handleError)
    );
  }
  eliminarWS(persona : Persona) : Observable<any> {
    return this.http.delete(this.url + "/eliminar", 
      {body: persona,
        observe: 'response',
        responseType:'json'
      }
    ).pipe(
      catchError(this.handleError)
    );
  }
  buscarWS(persona : Persona):Observable<Persona>{
    return this.http.post<Persona>(this.url + "/buscar", persona,
      {observe: 'response'}
    ).pipe(
      map(response => {
        if (response.status === 404) {
          throw{type: 'not-found', message: response.body};
        }
        return response.body as Persona;
      }),
      catchError(this.handleErrorB)
    )
  }
/******************************************************************* */
  private handleError(error: HttpErrorResponse) {
    if (error.status === 400) {
      // Manejo de errores de validación
      if (error.error && typeof error.error === 'object') {
        return throwError(() => ({
          type: 'validation',
          errors: error.error
        }));
      }
      return throwError(() => ({
        type: 'general',
        message: error.error || 'Error de validación desconocido'
      }));
    }
    return throwError(() => ({
      type: 'server',
      message: 'Error en el servidor: ' + error.message
    }));
  }

  private handleErrorL(error: HttpErrorResponse) {
    if (error.status === 204) { // NO_CONTENT
      return throwError(() => ({
        type: 'no-content',
        message: 'No se encontraron registros'
      }));
    }
    
    if (error.status === 500) { // INTERNAL_SERVER_ERROR
      return throwError(() => ({
        type: 'server',
        message: error.error?.message || 'Error en el servidor'
      }));
    }

    return throwError(() => ({
      type: 'unknown',
      message: 'Error desconocido al obtener los datos'
    }));
  }

  private handleErrorB(error: HttpErrorResponse) {
    console.error('Error en servicio Persona:', error);
    
    if (error.status === 400) {
      return throwError(() => ({
        type: 'validation',
        errors: error.error?.errors || error.error
      }));
    }
    
    if (error.status === 404) {
      return throwError(() => ({
        type: 'not-found',
        message: error.error?.message || 'Recurso no encontrado'
      }));
    }

    return throwError(() => ({
      type: 'server',
      message: error.error?.message || `Error del servidor (${error.status})`
    }));
  }

}
