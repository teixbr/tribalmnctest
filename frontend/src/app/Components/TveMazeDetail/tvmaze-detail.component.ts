import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
    selector: 'tvmaze-detail',
    templateUrl: './tvmaze-detail.component.html',
    styleUrls: ['./tvmaze-detail.component.css']
  })
  export class TvMazeDetailComponent {
  
    constructor( @Inject(MAT_DIALOG_DATA) public data: any)
    {
      console.log(data);
    }
  }