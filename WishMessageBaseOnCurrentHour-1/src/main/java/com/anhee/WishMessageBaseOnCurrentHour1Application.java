package com.anhee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.anhee.wish.WishBaseOnHour;

@SpringBootApplication
@ComponentScan(basePackages = "com.anhee.wish")
public class WishMessageBaseOnCurrentHour1Application {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(WishMessageBaseOnCurrentHour1Application.class, args);
		
		WishBaseOnHour bean = run.getBean(WishBaseOnHour.class);
		bean.wishBaseOnTime("Heena");
	}

}
