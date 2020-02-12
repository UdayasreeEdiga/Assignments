import { Component, OnInit } from '@angular/core';
import { $ } from 'protractor';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent  {
  
  userName: string;

  constructor() {

    this.userName="udayasree";

   }
   greet = ()=> {
     alert(`Hello!! ${this.userName} Good Morning`); 
   }

  
 
}
