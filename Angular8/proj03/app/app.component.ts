import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  private firstNum : number=null;
  private secondNum: number=null;
  private result: number=null;

   constuctor() {
    // this.firstNum=null;
    // this.secondNum=null;
    // this.result=null;    

}
public getAdd() : void {
  this.result=this.firstNum+this.secondNum;
  
}
public getSub() :void {
  this.result=this.firstNum-this.secondNum;
   
}
public getMul() :void{
  this.result=this.firstNum*this.secondNum;
  
}
public getDiv() :void {
  this.result=this.firstNum/this.secondNum;
  
}
}


 
 
