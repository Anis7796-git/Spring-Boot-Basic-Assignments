package com.anhee;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anhee.sbean.Hospital;
import com.anhee.sbean.HospitalService;

@SpringBootApplication
public class ApoloApplication {

	public static void main(String[] args) {
		try(
				ConfigurableApplicationContext run = SpringApplication.run(ApoloApplication.class, args);
				Scanner sc= new Scanner(System.in);
				){
			
			HospitalService bean = run.getBean(HospitalService.class);
			System.out.println("Enter your Hospital Localtion ");
			List<Hospital> getHospital = bean.GetHospital(sc.next());
			
			getHospital.forEach(System.out::print);
			
			
		}catch(Exception e) {
					
					e.printStackTrace();
				} finally {
				}
		
	}

}
