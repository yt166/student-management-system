import { Component } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-stu-registation',
  templateUrl: './stu-registation.component.html',
  styleUrls: ['./stu-registation.component.css']
})
export class StuRegistationComponent {

  private http;

  constructor (private httpCLient: HttpClient){

    this.http = httpCLient;
  }

  public student= {
     first_Name:null,
     last_Name:null,
     contact:null

  }

  public resentSavedStudent:any;

  createStudent(){

    if(this.student.contact==null || this.student.contact==""){
      return;
    }

    this.http.post("http://localhost:8080/student",this.student)
    .subscribe(data=>{
      console.log(data);
      this.resentSavedStudent=data;
     });
  }
}
