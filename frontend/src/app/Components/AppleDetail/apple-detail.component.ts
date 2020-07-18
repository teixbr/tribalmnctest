import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
    selector: 'apple-detail',
    templateUrl: './apple-detail.component.html',
    styleUrls: ['./apple-detail.component.css']
  })
  export class AppleDetailComponent {
  
    constructor( @Inject(MAT_DIALOG_DATA) public data: any)
    {}
  }