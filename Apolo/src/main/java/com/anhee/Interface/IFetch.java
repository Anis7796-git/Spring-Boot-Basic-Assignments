package com.anhee.Interface;

import java.util.List;

import com.anhee.sbean.Hospital;

public interface IFetch {
	
	 List<Hospital> fetchHospitalDetail(String locationan) throws Exception;
}
