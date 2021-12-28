import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { LoginUser } from 'src/app/Models/LoginUser';
import { AuthService } from 'src/app/Services/auth.service';
import { TokenService } from 'src/app/Services/token.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  form: FormGroup;
  default = 'World';
  hide = true;
  isLogged = false;
  isLoginFail = false;
  loginUser: LoginUser;
  userName: string;
  password: string;
  roles: string[] = [];
  errMsg: string;


  constructor(
    private snackBar: MatSnackBar,
    private fb: FormBuilder,
    private tokenService: TokenService,
    private authService: AuthService,
    private router: Router,
  ) {
    this.form = this.fb.group({
      user: ['', Validators.required],
      pass: ['', Validators.required]
    })
  }

  ngOnInit(): void {
    if (this.tokenService.getToken()) {

      this.isLogged = true;
      this.isLoginFail = false;
      console.log('isLogged true', this.isLogged);
      console.log('isLoginFail', this.isLoginFail);
      this.roles = this.tokenService.getAuthorities();
      console.log('login.component. roles:', this.roles);
    }
  }

  onLogin(): void {
    this.userName = this.form.value.user;
    this.password = this.form.value.pass;
    this.loginUser = new LoginUser(this.userName, this.password);
    this.authService.login(this.loginUser).subscribe(
      data => {
        this.isLogged = true;
        this.isLoginFail = false;
        this.tokenService.setToken(data.token);
        this.tokenService.setUserName(data.userName);
        this.tokenService.setAuthorities(data.authorities);
        this.roles = data.authorities;
        console.log('login data is: ', data);
        console.log('login data type: ', (data.type));
        console.log('login data userName is:', data.userName);
        console.log('login data token is:', data.token);
        console.log('data.authorities are: ', JSON.stringify(data.authorities));
        console.log('roles: ', this.roles);
        this.router.navigate(['/']);
      },
      err => {
        this.isLogged = false;
        this.isLoginFail = true;
        this.errMsg = err.error.message;
        this.snackBar.open(this.errMsg, ':P', {
          duration: 3000,
          horizontalPosition: 'center',
          verticalPosition: 'top',

        });
      }
    )
  }
}
