import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { City } from '../Models/city';

@Injectable({
  providedIn: 'root'
})
export class cityService {
    citiesUrl: 'http://localhost:8080/city/';
  constructor(private httpClient: HttpClient) { }

  public getCityList(): Observable<City[]>{
    return this.httpClient.get<City[]>(this.citiesUrl + 'listOfCities');
  }

  public getCityDetail(id: number): Observable<City[]>{
    return this.httpClient.get<City[]>(this.citiesUrl + 'detail/${id}');
  }

  public getCityName(name: string): Observable<City[]>{
    return this.httpClient.get<City[]>(this.citiesUrl + 'detailname/${name}');
  }

  }

