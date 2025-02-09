package com.anhee.sbean;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class StudentDataSave {
	
	ArrayList<Student> pass= new ArrayList<Student>();
    ArrayList<Student> fail= new ArrayList<Student>();;
    
 public void  addStudentData(Student s){
    	
	 if(s.getResult().equalsIgnoreCase("pass")) {
		 pass.add(s);
	 }else
	 {
		 fail.add(s);
	 }
    }
 
// public ArrayList<Student> passStudent() {
//	 return pass;
// }
// 
// public ArrayList<Student> faildStudent(){
//	 return fail;
// }
// 
 

}
