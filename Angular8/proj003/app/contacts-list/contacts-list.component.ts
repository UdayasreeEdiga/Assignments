import { Component, OnInit } from '@angular/core';
import { ContactService } from '../services/contact.service';
import { Contact } from '../models/contact';

@Component({
  selector: 'app-contacts-list',
  templateUrl: './contacts-list.component.html',
  styleUrls: ['./contacts-list.component.css']
})
export class ContactsListComponent implements OnInit {

  contacts : Contact[];
  constructor(private contServ:ContactService) {}

  ngOnInit() {
    this.contacts=this.contServ.getAll();
  }
  
  delete(contactID:number) {
    if(confirm(`Are you sure of deleting contact#${contactID}`)) {
      this.contServ.delete(contactID);
      
    }
  }
}
