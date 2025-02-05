package com.season.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("season")
public class SeasonFinder {
	
	@Autowired
	private LocalDate ld;

	
	
	public String seasons() {
		System.out.println("SeasaonFinder.seasons()");
		int monthValue = ld.getMonthValue();
		if (monthValue>=3 && monthValue<=6) {
			return "Winter Season";
		} else if(monthValue >= 7 && monthValue <=10){
			return "Rainy Season";
		}else {
			return "Summer Season";
		}
	}
	

}
