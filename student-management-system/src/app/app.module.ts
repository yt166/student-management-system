import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './common/header/header.component';
import { SidePaneComponent } from './common/side-pane/side-pane.component';
import { HomeComponent } from './pages/home/home.component';
import { StuRegistationComponent } from './pages/stu-registation/stu-registation.component';
import { StuListComponent } from './pages/stu-list/stu-list.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    SidePaneComponent,
    HomeComponent,
    StuRegistationComponent,
    StuListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
