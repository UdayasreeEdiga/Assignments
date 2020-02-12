import { Injectable } from '@angular/core';
import { Contact } from '../models/contact';

@Injectable({
  providedIn: 'root'
})
export class ContactService {

  contacts:Contact[];
  
  constructor() {

    this.contacts=[
      {contactID:101,firstName:"Udayasree",lastName:"e",dob:new Date("1998-12-30"),mobileNumber:"9876545012",mailId:"udayasree@gmail.com",organization:"cts"},
      {contactID:102,firstName:"harshitha",lastName:"e",dob:new Date("2000-02-24"),mobileNumber:"9824543210",mailId:"harshitha@gmail.com",organization:"cts"},
      {contactID:103,firstName:"nithish",lastName:"e",dob:new Date("1998-10-30"),mobileNumber:"9876543245",mailId:"nithish@gmail.com",organization:"cts"},
      {contactID:104,firstName:"harsha",lastName:"e",dob:new Date("1996-12-30"),mobileNumber:"9876543398",mailId:"harsha@gmail.com",organization:"cts"},
      {contactID:105,firstName:"nishanth",lastName:"e",dob:new Date("1998-10-20"),mobileNumber:"9876577845",mailId:"nishanth@gmail.com",organization:"cts"},
    ];
   }

   getAll():Contact[] {
     return this.contacts;
   }

   get(id:number) {
     return this.contacts.find((c)=>(c.contactID==id));
  
   }
   
   add(contact:Contact) {
     this.contacts.push(contact);
   }

   update(contact:Contact) {
     let index=this.contacts.findIndex((c)=>(c.contactID===contact.contactID));
     if(index>-1) {
       this.contacts[index]=contact;
     }
   }

   delete(id:number) {
     let index=this.contacts.findIndex((contact)=>(contact.contactID===id));
     if(index>-1) {
       this.contacts.splice(index,1);
     }
   }

}
