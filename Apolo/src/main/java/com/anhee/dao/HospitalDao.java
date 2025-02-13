package com.anhee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anhee.Interface.IFetch;
import com.anhee.sbean.Hospital;

@Component
public class HospitalDao implements IFetch {
		
		@Autowired
		private DataSource ds;
	private final String Get_hospital_details="select * from Hospital where location=?";
	
	//create table Hospital(branchName varchar2(15),location varchar2(15),code varchar2(15),hospitalName varchar2(15));
	
	
	@Override
	public List<Hospital> fetchHospitalDetail(String locationan)throws Exception  {
		
			List<Hospital> list= new ArrayList<Hospital>();
			
		try(	Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(Get_hospital_details);)
		
		{
			ps.setString(1, locationan);
			try (ResultSet rs = ps.executeQuery();){
				
				
				while(rs.next()) {
					Hospital hs=new Hospital();
						
					hs.setHospitalName(rs.getString(1));
					hs.setCity(rs.getString(2));
					hs.setBranchName(rs.getString(3));
					hs.setCode(rs.getString(4));
					
					list.add(hs);
					
				}
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		catch(SQLException se) {
			se.printStackTrace();
		} 
		
		return list;
	}

}
