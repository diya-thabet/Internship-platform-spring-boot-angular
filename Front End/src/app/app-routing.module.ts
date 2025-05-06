import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { BlocdashComponent } from './blocdash/blocdash.component';
import { WaitComponent } from './wait/wait.component';
import {RoadmapdetailComponent  } from './roadmapdetail/roadmapdetail.component';
const routes: Routes = [
  { path: "", component: LoginComponent },
  { path: "login", component: LoginComponent },
  { path: "navbar", component: NavbarComponent },
  { path: "sidebar", component: SidebarComponent },
  { path: "bloc", component: BlocdashComponent },
  { path: "wait", component: WaitComponent },
  { path: "roadmapdetail", component: RoadmapdetailComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
