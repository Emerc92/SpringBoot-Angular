import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { City } from '../Models/city';

@Injectable({
  providedIn: 'root'
})
export class cityService {

  constructor(private httpClient: HttpClient) { }

  getCityList(): Observable<City[]>{
    return this.httpClient.get<City[]>("http://localhost:8080/city/list");
  }
}
