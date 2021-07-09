import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { City } from '../Models/city';
import { TokenService } from './token.service';

@Injectable({
  providedIn: 'root'
})
export class cityService {
    citiesUrl: 'http://localhost:8080/city/';
  constructor(
    private httpClient: HttpClient,
    private tokenService: TokenService) { }

  public getCityList(): Observable<City[]>{
    this.httpClient.head( this.tokenService.getToken());
    return this.httpClient.get<City[]>(this.citiesUrl + 'list');
  }

  public getCityDetail(id: number): Observable<City>{
    return this.httpClient.get<City>(this.citiesUrl + 'detail/${id}');
  }

  public getCityName(name: string): Observable<City>{
    return this.httpClient.get<City>(this.citiesUrl + 'detailname/${name}');
  }

  }

