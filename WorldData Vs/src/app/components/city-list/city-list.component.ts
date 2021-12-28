import { Component, AfterViewInit, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { cityService } from 'src/app/Services/city.service';
import { Router } from '@angular/router';
import { City } from 'src/app/Models/City';
@Component({
  selector: 'app-city-list',
  templateUrl: './city-list.component.html',
  styleUrls: ['./city-list.component.css']
})

export class CityListComponent implements OnInit, AfterViewInit {
  tableColumns: string[] = ['id', 'name', 'countryCode', 'district', 'population', 'code', 'continent'];
  dataSource = new MatTableDataSource<City>();
  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;
  isLoaded = false;

  constructor(
    private service: cityService,
    private router: Router
    ) { }

  ngOnInit() {
    this.getCityList();
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }
  ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }

  private getCityList() {
    this.service.getCityList().subscribe(data => {
      console.log("data is:", data);
      this.dataSource.data = data;
      this.isLoaded = true;
      this.dataSource.paginator = this.paginator;
      this.router.navigate(['/list']);
    });
  }
  //per la ricerca smart
  public doFilter = (value: string) => {
    this.dataSource.filter = value.trim().toLocaleLowerCase();
  }
}