import { Component, OnInit, ViewChild } from '@angular/core';
import { GroupedDto } from './model/GroupedDto';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { MatDialog } from '@angular/material/dialog';
import { AppleDetailComponent } from './Components/AppleDetail/apple-detail.component';
import { TvMazeDetailComponent } from './Components/TveMazeDetail/tvmaze-detail.component';
import { CrcDetailComponent } from './Components/CrcDetail/crc-detail.component';
import { AppService } from './app.service';

const DATA: GroupedDto[] = [
]

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  constructor(private dialog : MatDialog, private appService: AppService )
  {}

  displayedColumns: string[] = ['fuente', 'nombre', 'vermas'];
  dataSource = new MatTableDataSource<GroupedDto>(DATA);
  
  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;

  ngOnInit() {
    this.dataSource.paginator = this.paginator;
  }

  search( params ): void {
    this.appService.search( params.replace(/\s/g, "-") )
      .subscribe( x => {

        if ( x.length == 0 )
        {
          confirm("No se obtuvieron resultados");
        }

        x.forEach(function (value) 
        {
          if ( value.itunesInfo != null )
          {
            value.photo =  "../assets/itunes-logo.png";
          }
          else if ( value.tvMazeInfo != null )
          {
            value.photo =  "../assets/tvmaze-logo.png";
          }
          else if ( value.crcInfo != null )
          {
            value.photo = "../assets/crc-logo.jpeg";
          }
        });
        this.dataSource = new MatTableDataSource<GroupedDto>(x);
        this.dataSource.paginator = this.paginator;
     } )
  }

  seeMore(element)
  {
    console.log(element);
      if ( element.itunesInfo != null )
      {
        this.dialog.open(AppleDetailComponent, {
          data: element,
          width: "55%",
          autoFocus: true
        });
      }
      else if ( element.tvMazeInfo != null )
      {
        this.dialog.open(TvMazeDetailComponent, {
          data: element,
          width: "55%",
          autoFocus: true
        });
      }
      else if ( element.crcInfo != null )
      {
        this.dialog.open(CrcDetailComponent, {
          data: element,
          width: "55%",
          autoFocus: true
        });
      }
  }
}
