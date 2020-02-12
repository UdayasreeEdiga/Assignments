import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent  {

  webTitle:string;
  welcomeText:string;
  welcomeImage:string;
  

  constructor() { 

    this.webTitle="Angular Demo App";
    this.welcomeText=" welcome to Angular";
    this.welcomeImage="assets/image/image.jpg";
  
  }

  
}


