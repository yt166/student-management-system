import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-stu-list',
  templateUrl: './stu-list.component.html',
  styleUrls: ['./stu-list.component.css']
})

export class StuListComponent implements OnInit{

  private http;
  public studentList : any;
  public selectedStudent : any;
  
  constructor(private httpClient : HttpClient){
    this.http = httpClient;
  }
  ngOnInit(): void {
    this.getStudents();
  }

  getStudents(){
    this.http.get("http://localhost:8080/getStudent")
    .subscribe(data=>{
      console.log(data);

      this.studentList=data;
    });
  }

  public removeStudent(){
    
    let apiURL = "http://localhost:8080/remove/"+this.selectedStudent.stu_id;
    // const apiURL = `http://localhost:8080/remove/${student.id}`;

    this.http.delete(apiURL)
    .subscribe(data=>{
      console.log(data);
      this.getStudents();
      this.selectedStudent=null;
    })
  }

  setSelectedStudent(student : any){
      this.selectedStudent=student;
  }

  updateStudent(){
 
    this.http.post("http://localhost:8080/student",this.selectedStudent)
    .subscribe(data=>{
      console.log(data);
      this.selectedStudent=null;
      this.getStudents();
     });
  }

}
