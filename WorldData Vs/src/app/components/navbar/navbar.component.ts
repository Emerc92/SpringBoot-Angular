import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TokenService } from 'src/app/Services/token.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  title = "World"
  isLogged = false;

  constructor(
    private tokenService: TokenService,
    private router: Router) { }

  ngOnInit() {
    if (this.tokenService.getToken() != null) {
      console.log('isLogged true');
      this.isLogged = true;
    } else {
      console.log('isLogged false');
      this.isLogged = false;
    }
  }
  onLogout(): void {
    this.tokenService.logOut();
    window.location.reload();
    console.log('logOut realizzato'+ this.tokenService.getToken());
  
  }
}
