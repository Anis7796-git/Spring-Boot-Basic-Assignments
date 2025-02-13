package com.anhee.payment;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anhee.helper.Payment;
import com.anhee.helper.PaymentSucsessful;
import com.anhee.sbean.User;

@Component("payPalPayment")
public class PayPalPayment  implements Payment{
	public static final String BLUE = "\033[0;34m";
	 public static final String RED = "\033[0;31m";
	@Autowired
	private PaymentSucsessful paymentSucsessful;

	@Override
	public void processPayment(User user, double amount) {
		try {
			System.out.println(BLUE+"Please Wait "+user+"  PayPal payment amount"+amount+" has been processed");
			paymentSucsessful.paymentprocess(user,amount);
			try {
				System.out.println(RED+"Loading...");
				Thread.sleep(1000);
				System.out.println("Transaction Complete");
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
