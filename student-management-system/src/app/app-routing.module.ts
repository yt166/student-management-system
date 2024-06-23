import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { StuRegistationComponent } from './pages/stu-registation/stu-registation.component';
import { StuListComponent } from './pages/stu-list/stu-list.component';

const routes: Routes = [
{
  path:"",
  component: HomeComponent
},
{
  path:"register",
  component:StuRegistationComponent
},
{
  path:"list",
  component: StuListComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
