import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from  '@angular/forms';
import {RouterModule, Routes} from '@angular/router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HelloComponent } from './hello/hello.component';

import { PipesDemoComponent } from './pipes-demo/pipes-demo.component';
import { VerbalPipe } from './pipes/verbal.pipe';
import { NavBarComponent } from './nav-bar/nav-bar.component';

const routes : Routes= [
  {path:"",component:HelloComponent},
  {path:"pdm",component:PipesDemoComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HelloComponent,
 
    PipesDemoComponent,
 
    VerbalPipe,
 
    NavBarComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
