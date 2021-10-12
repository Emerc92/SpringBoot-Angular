import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { Login } from 'src/app/Models/login';
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
  loginUser: Login;
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
    if (this.tokenService.getToken() != null) {
      console.log('isLogged true (login.ts)');
      console.log('isLoginFail false');
      this.isLogged = true;
      this.isLoginFail = false;
      this.roles = this.tokenService.getAuthorities();
    }
  }

  onLogin(): void {
    this.userName = this.form.value.user;
    this.password = this.form.value.pass;
    this.loginUser = new Login(this.userName, this.password);
    this.authService.login(this.loginUser).subscribe(
      data => {
        this.isLogged = true;
        this.isLoginFail = false;
        this.tokenService.setToken(data.token);
        this.tokenService.setUserName(data.userName);
        if(data.userName.toString()=== 'emilianoAdmin'){
          console.log('sei il boss')
        }
        this.tokenService.setAuthorities(data.authorities);
        console.log('data.authorities are: ',JSON.stringify(data.authorities[0]));
        this.roles = data.authorities;
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
