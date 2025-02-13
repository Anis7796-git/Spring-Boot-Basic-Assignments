package com.anhee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anhee.helper.PaymentSucsessful;
import com.anhee.sbean.User;
@Component
public class PaymentProcessDAO implements PaymentSucsessful{

	@Autowired
	private DataSource ds;
	
	
	
	
	
	private String insert="insert into paypal (ID,NAME,EMAIL,BALANCE,TRANS_TYPE)values(?,?,?,?,?)";
	
	@Override
	public int paymentprocess(User user, Double amount) throws SQLException {
		int k=0;
		try(Connection con=ds.getConnection(); PreparedStatement ps=con.prepareStatement(insert)){
			
			ps.setInt(1, user.getId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getEmail());
			ps.setDouble(4, amount);
			ps.setString(5, user.getType());
			
			 k = ps.executeUpdate();
		}catch(Exception e) {
			throw e ;
		}
		return k;
		
	}

}
