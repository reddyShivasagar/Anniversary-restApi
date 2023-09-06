package com.dakr.Anniversary_Api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dakr.Anniversary_Api.entity.AnniversaryDetails;

@Service
public interface AnniDetailsService {

    	public AnniversaryDetails saveDetails(AnniversaryDetails details);
		
		public void deleteDetails(Integer id);
		
	    public AnniversaryDetails getDetails(Integer id); 
		
		public List<AnniversaryDetails> getAllDetails();
		
		public AnniversaryDetails updateDetails(AnniversaryDetails details,Integer id);

	
}
