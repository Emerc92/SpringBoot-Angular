import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { JwtDto } from '../Models/JwtDto';
import { LoginUser } from '../Models/LoginUser';
import { NewUser } from '../Models/NewUser';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
authURL = 'http://localhost:8080/auth/';
  constructor(private httpClient: HttpClient) {}

  public newUser(newUser: NewUser): Observable<any>{
    console.log("auth service new user:", newUser);
    return this.httpClient.post<any>(this.authURL +'newuser', newUser);
  }
   
  public login(login: LoginUser): Observable<JwtDto>{
    console.log("auth service login:", login);
    return this.httpClient.post<JwtDto>(this.authURL +'login', login);
  }

}
