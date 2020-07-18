import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
    selector: 'crc-detail',
    templateUrl: './crc-detail.component.html',
    styleUrls: ['./crc-detail.component.css']
  })
  export class CrcDetailComponent {
  
    constructor( @Inject(MAT_DIALOG_DATA) public data: any)
    {
    }
  }