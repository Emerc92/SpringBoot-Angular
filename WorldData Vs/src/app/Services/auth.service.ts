import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { JwtDTO } from '../Models/Jwt-DTO';
import { Login } from '../Models/login';
import { NewUser } from '../Models/NewUser';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
authURL = 'http://localhost:8080/auth/';
  constructor(private httpClient: HttpClient) {}

  public newUser(newUser: NewUser): Observable<any>{
    return this.httpClient.post<any>(this.authURL +'newUser', newUser);
  }
   
  public login(login: Login): Observable<JwtDTO>{
    return this.httpClient.post<JwtDTO>(this.authURL +'login', login);
  }

}
