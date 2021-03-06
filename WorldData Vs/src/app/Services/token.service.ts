import { Injectable } from '@angular/core';

 const TOKEN_KEY = 'AuthToken';
 const USERNAME_KEY = 'AuthUserName';
 const AUTHORITIES_KEY = 'AuthAuthorities';

@Injectable({
  providedIn: 'root'
})
export class TokenService {
  userName:string;
  roles: Array<string> = [];
  constructor() { }

  public setToken(token: string): void {
    window.sessionStorage.removeItem(TOKEN_KEY);
    window.sessionStorage.setItem(TOKEN_KEY, token);
  }

  public getToken(): string {
    return sessionStorage.getItem(TOKEN_KEY) ;
  }

  public setUserName(userName: string): void {
    window.sessionStorage.removeItem(USERNAME_KEY );
    window.sessionStorage.setItem(USERNAME_KEY , userName);
    console.log("l'username inserito è :" + userName)
  }

  public getUserName(): string {
    if(sessionStorage.getItem(USERNAME_KEY) != null){

      this.userName = USERNAME_KEY;
    }
    return sessionStorage.getItem(USERNAME_KEY) ;
  }


  public setAuthorities(authorities: string[]): void {
    window.sessionStorage.removeItem(AUTHORITIES_KEY);
    window.sessionStorage.setItem(AUTHORITIES_KEY, JSON.stringify(authorities));
    console.log("authorities :", authorities);
  }

  public getAuthorities(): string[] {
    this.roles = [];
    if (sessionStorage.getItem(AUTHORITIES_KEY)) {
       JSON.parse(sessionStorage.getItem(AUTHORITIES_KEY)).forEach(authority =>{
         this.roles.push(authority.authority);
         console.log("role :" , this.roles);
       });
    }
    return this.roles;
  }

  public logOut(): void {
    window.sessionStorage.clear();
  }

}
