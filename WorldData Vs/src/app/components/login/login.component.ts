import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Login } from 'src/app/Models/login';
import { AuthService } from 'src/app/Services/auth.service';
import {  LoginServiceService } from 'src/app/Services/login.service';
import { TokenService } from 'src/app/Services/token.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
    default = 'eplastic';
    hide = true;
    isLogged = false;
    isLoginFail = false;
    loginUser: Login;
    username: string;
    password: string;
    roles: string[] = [];

  constructor(
    private tokenService: TokenService,
    private authService: AuthService,
    private router: Router,
    private loginService: LoginServiceService
    ) { }


  ngOnInit(): void {
    if(this.tokenService.getToken()){
      this.isLogged = true;
      this.isLoginFail = false;
      this.roles = this.tokenService.getAuthorities();
    }
  }

  onLogin(): void{

  }

}
