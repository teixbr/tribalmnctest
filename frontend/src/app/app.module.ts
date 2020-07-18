import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule }   from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { HttpErrorHandler } from './http-error-handler.service';
import { MessageService } from './message.service'
import { AppService } from './app.service';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatTableModule } from '@angular/material/table';  
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatButtonModule } from '@angular/material/button';
import { MatDialogModule } from '@angular/material/dialog'
import { MatGridListModule } from '@angular/material/grid-list';
import { AppleDetailComponent } from './Components/AppleDetail/apple-detail.component';
import { TvMazeDetailComponent } from './Components/TveMazeDetail/tvmaze-detail.component';
import { CrcDetailComponent } from './Components/CrcDetail/crc-detail.component';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner'

@NgModule({
  declarations: [
    AppComponent,
    AppleDetailComponent,
    TvMazeDetailComponent,
    CrcDetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    MatTableModule,
    MatFormFieldModule,
    MatInputModule,
    MatPaginatorModule,
    MatButtonModule,
    MatDialogModule,
    MatGridListModule,
    HttpClientModule,
    MatProgressSpinnerModule
  ],
  exports: [
    MatInputModule,
    FormsModule,
    MatTableModule,
    MatFormFieldModule,
    MatInputModule,
    MatPaginatorModule,
    MatButtonModule,
    MatDialogModule,
    MatGridListModule,
    MatProgressSpinnerModule
  ],
  providers: [
    HttpErrorHandler,
    MessageService,
    AppService
  ],
  bootstrap: [AppComponent],
  entryComponents: [AppleDetailComponent,
  TvMazeDetailComponent, 
  CrcDetailComponent]
})
export class AppModule { }
