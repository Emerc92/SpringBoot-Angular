import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {
  url = "http:/localhost:8080";
  constructor(private service:HttpClient) { }
  
  generateToken(credentials:any){
    return this.service.post('${this.url}/token',credentials);

  }

  LoginUser(token) {
    localStorage.setItem("token", token)
    return true;
  }

  isLoggedIn() {
    let token = localStorage.getItem("token");
    if (token == undefined || token === '' || token == null) {
      return false;
    } else {
      return true;
    }
  }
  logout() {
    localStorage.removeItem('token');
    return true;
  }

  getToken() {
    return localStorage.getItem('token');
  }
}
