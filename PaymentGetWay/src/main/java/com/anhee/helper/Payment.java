package com.anhee.helper;

import java.sql.SQLException;

import com.anhee.sbean.User;

public interface Payment {
	void processPayment(User user, double amount) throws SQLException;

}
