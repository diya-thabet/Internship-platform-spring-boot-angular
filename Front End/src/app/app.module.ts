import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { BlocdashComponent } from './blocdash/blocdash.component';
import { WaitComponent } from './wait/wait.component';
import { RoadmapdetailComponent } from './roadmapdetail/roadmapdetail.component';
import { IntershipComponent } from './intership/intership.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    NavbarComponent,
    SidebarComponent,
    BlocdashComponent,
    WaitComponent,
    RoadmapdetailComponent,
    IntershipComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
