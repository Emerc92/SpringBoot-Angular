import { Component, AfterViewInit, OnInit, ViewChild} from '@angular/core';
import { City } from 'src/app/Models/city';
import { MatTableDataSource} from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { cityService } from 'src/app/Services/city.service';
@Component({
  selector: 'app-city-list',
  templateUrl: './city-list.component.html',
  styleUrls: ['./city-list.component.css']
})

export class CityListComponent implements OnInit, AfterViewInit {
  tableColumns : string[] = ['id', 'name', 'countryCode', 'district', 'population', 'code', 'continent'];
  dataSource = new MatTableDataSource<City>();
  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;


  constructor(private service : cityService){}
  
  ngOnInit(){
    this.getCityList();
  }
  ngAfterViewInit() { 
    this.dataSource.sort = this.sort;
  }

  private getCityList(){
    this.service.getCityList().subscribe(data => {
      this.dataSource.data = data;
      this.dataSource.paginator = this.paginator;
    });
  }
  //per la ricerca smart
  public doFilter = (value: string) => {
    this.dataSource.filter = value.trim().toLocaleLowerCase();
  }
}