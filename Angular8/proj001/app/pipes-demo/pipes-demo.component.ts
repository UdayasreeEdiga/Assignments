import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes-demo',
  templateUrl: './pipes-demo.component.html',
  styleUrls: ['./pipes-demo.component.css']
})
export class PipesDemoComponent  {
  strDate: string;
  numData :number;
  date: Date;


  constructor() { 
    this.strDate="Hello";
    this.numData=Math.PI;
    this.date= new Date();

  }


}
