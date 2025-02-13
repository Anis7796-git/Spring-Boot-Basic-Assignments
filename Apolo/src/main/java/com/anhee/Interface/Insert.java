package com.anhee.Interface;

import java.util.List;

import com.anhee.sbean.Hospital;

public interface Insert {
	
	 List<Hospital> GetHospital(String location) throws Exception;

}
