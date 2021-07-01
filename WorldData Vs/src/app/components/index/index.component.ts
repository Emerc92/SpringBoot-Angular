import { Component, OnInit } from '@angular/core';
import { TokenService } from 'src/app/Services/token.service';

@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent implements OnInit {
  admin = false;
  isLogged = false;
  userName = '';

  constructor(
    private tokenService: TokenService
  ) { }

  ngOnInit(): void {
    if (this.tokenService.getToken() != null) {
      console.log('isLogged = true');
      this.isLogged = true;
      this.userName = this.tokenService.getUserName();
      if (this.userName === 'emilianoAdmin') {
        this.admin = true;
      }
    } else {
      console.log('isLogged = false');
      this.isLogged = false;
      this.userName = '';
    }
  }
 


}
