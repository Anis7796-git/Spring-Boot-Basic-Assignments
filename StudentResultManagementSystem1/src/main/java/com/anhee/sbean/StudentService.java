package com.anhee.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class StudentService {
	@Autowired
	public StudentDataSave save;   
	
 public void addStudentResult(Student a) {
	if(a.getMarks()>60) {
		
		a.setResult("Pass");
	}else {
		a.setResult("fail");
	}
	
	save.addStudentData(a);
	
}	

}
