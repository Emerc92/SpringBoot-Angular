import { Component, OnInit } from '@angular/core';
import { TokenService } from 'src/app/Services/token.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  title = "World"
  isLogged = false;
  constructor(private tokenService: TokenService) { }

  ngOnInit() {
    if (this.tokenService.getToken) {
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }
  }
onLogout(): void{
  this.tokenService.logOut();
  window.location.reload();
}
}
