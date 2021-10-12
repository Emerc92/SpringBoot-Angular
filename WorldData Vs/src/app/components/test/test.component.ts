import { Component, OnInit } from '@angular/core';
import { City } from 'src/app/Models/City';
import { cityService } from 'src/app/Services/city.service';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})

export class TestComponent implements OnInit {
  data: City[];

  constructor(
    private cityService: cityService) { }

  ngOnInit(): void {
    this.cityService.getCityList().subscribe(
       resource=>{

        this.data= resource;
    }),
    error =>{
      const err = error.msj;
    }
  }

}
