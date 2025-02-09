package com.season;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.anhee.WeekdayWish;
@Configuration
@SpringBootApplication
@ComponentScan(basePackages = "com.anhee")
public class WishMessageBaseOnWeekDayApplication {
	

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(WishMessageBaseOnWeekDayApplication.class, args);
	WeekdayWish bean = run.getBean(WeekdayWish.class);
	
	
	
	bean.WishMessage();
	}
}
