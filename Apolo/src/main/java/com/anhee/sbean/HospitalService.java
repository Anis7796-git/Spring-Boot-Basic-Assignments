package com.anhee.sbean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anhee.Interface.IFetch;
import com.anhee.Interface.Insert;

@Service
public class HospitalService implements Insert{
		
		@Autowired
		private IFetch fetch;	
	@Override
	public List<Hospital> GetHospital(String location) throws Exception  {
		
		List<Hospital> list = fetch.fetchHospitalDetail(location);
		return list;
		
		
	}
	
	
	
	

}
