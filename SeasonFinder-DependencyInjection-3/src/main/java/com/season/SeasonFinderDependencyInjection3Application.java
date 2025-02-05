package com.season;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.season.sbeans.SeasonFinder;

@SpringBootApplication
public class SeasonFinderDependencyInjection3Application {
	
	@Bean(name="ld")
	public LocalDate localDate() {
		return LocalDate.now();
	}
	

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext run = SpringApplication.run(SeasonFinderDependencyInjection3Application.class, args);
		
		SeasonFinder bean = run.getBean("season",SeasonFinder.class);
		
		
		String seasons = bean.seasons();
		
		System.out.println("Current Season is "+seasons);
		
	}

}
