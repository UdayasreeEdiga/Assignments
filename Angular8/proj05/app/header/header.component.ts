import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent   {
  private title: String=null;
  private logo:String=null;

  public constructor() { 
    this.title="Header Component";
    this.logo="assets/logo.png";
  }

 

}
