package com.anhee;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeekdayWish {
	
	
	private LocalDate date;
	
	public WeekdayWish() {
		date=LocalDate.now();
	}
	
	public void WishMessage() {
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		
		if(dayOfWeek==DayOfWeek.SATURDAY||dayOfWeek.equals(DayOfWeek.SUNDAY)){
			System.out.println("Today is a holiday! Enjoy your day off! ");
		}else {
			System.out.println("Today is a working day. Let's get things done! 💼");
		}
	}

}
