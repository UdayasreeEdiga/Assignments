import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ContactDetailsComponent } from './contact-details/contact-details.component';
import { ContactFormComponent } from './contact-form/contact-form.component';
import { ContactsListComponent } from './contacts-list/contacts-list.component';
import { DashBoardComponent } from './dash-board/dash-board.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

const routes: Routes = [

  {path:'',component:DashBoardComponent},
  {path:'list',component:ContactsListComponent},
  {path:'add',component:ContactFormComponent},
  {path:'edit/:id',component:ContactFormComponent},
  {path:'details/:id',component:ContactDetailsComponent},
  {path:'**',component:PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
