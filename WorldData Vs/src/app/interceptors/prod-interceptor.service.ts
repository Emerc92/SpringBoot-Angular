import { HttpEvent, HttpHandler, HttpInterceptor, HttpRequest, HTTP_INTERCEPTORS } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TokenService } from '../Services/token.service';

@Injectable({
  providedIn: 'root'
})
export class ProdInterceptorService implements HttpInterceptor{

  constructor(
    private tokenService: TokenService
  ) { }
  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>>{
    let intReq = req;
    const token = this.tokenService.getToken();
    console.log("ProdInterceptorService - token:", token);
    if(token != null){
      intReq = req.clone({
        headers: req.headers.set('Authorization', 'Bearer '+  token)
      });
    }
    console.log("ProdInterceptorService - intReq:", intReq);
    return next.handle(intReq);
  }
}

export const interceptorProvider = [{provide: HTTP_INTERCEPTORS, useClass: ProdInterceptorService, multi: true}];