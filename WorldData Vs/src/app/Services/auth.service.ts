import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { JwtDTO } from '../Models/Jwt-DTO';
import { Login } from '../Models/login';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
authURL = ''
  constructor(private httpClient: HttpClient) {}
   
  public login(login: Login): Observable<JwtDTO>{
    return this.httpClient.post<JwtDTO>(this.authURL +'login', login);
  }

}
