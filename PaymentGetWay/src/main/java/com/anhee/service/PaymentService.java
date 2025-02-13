package com.anhee.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.anhee.helper.Payment;
import com.anhee.sbean.User;

@Service
public class PaymentService {
	
	@Autowired
	@Qualifier("creditCardPayment")
	private Payment creditcard;
	
	@Autowired
	@Qualifier("payPalPayment")
	private Payment paypal;
	
	public void  processUserPayment(User user, double amount, String type) throws SQLException{
		 if(type.equalsIgnoreCase("creditcard")) {
			 
			 user.setType("creditcard");
			 creditcard.processPayment(user, amount);
		 }else if(type.equalsIgnoreCase("paypal")){
			 user.setType("paypal");
			 paypal.processPayment(user, amount);
			 }else {
				 System.out.println("sorry sir your "+type+"is not accept here");
			 }
	 } 

}
