package com.anhee.wish;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishBaseOnHour {
	
	
	private LocalTime time=LocalTime.now();
	
	public void wishBaseOnTime(String name) {
		
		int hour = time.getHour();
		
		if(hour  >=7 &&hour  <=9 ) {
			System.out.print("Good Morning"+name);
		} else if(hour  >=12 &&hour  <6 ) {
			System.out.print("Good AfterNoon"+name);
		}else {
			System.out.print("Good Evening"+name);
		}
		
		
	}
	

}
