package com.anhee;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anhee.sbean.User;
import com.anhee.service.PaymentService;

@SpringBootApplication
public class PaymentGetWayApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(PaymentGetWayApplication.class, args);
		try {
		PaymentService bean = run.getBean(PaymentService.class);
//		private String  name, email;
//		private Integer id;
//		private Double amout;
		
		Scanner sc = new Scanner(System.in);
		User user= new User();
		System.out.println("enter the name ");
		String name = sc.next();
		user.setName(name);
		
		System.out.println("enter the id ");
		int id = sc.nextInt();
		user.setId(id);
		
		
		System.out.println("enter the amout ");
		double amount = sc.nextDouble();
		user.setAmout(amount);
		
		System.out.println("choose card type \n press 1 for Credit Card \n press 2 for Paypal \n other press 3");
		int key = sc.nextInt();
		String type=null;
		switch (key) {
		case 1: 
			type="creditcard";
			break;
		case 2:
			type="paypal";
		case 3:
			type="other";
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
		
			bean.processUserPayment(user, amount,type);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			run.close();
			
		}
	}

}
