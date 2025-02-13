package com.anhee.helper;

import java.sql.SQLException;

import com.anhee.sbean.User;

public interface PaymentSucsessful {

	int paymentprocess(User user,Double amount) throws SQLException;
	
	
}
