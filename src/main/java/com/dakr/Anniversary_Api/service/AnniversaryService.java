package com.dakr.Anniversary_Api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dakr.Anniversary_Api.entity.AnniversaryType;

@Service
public interface AnniversaryService {
	
	public AnniversaryType saveAnni(AnniversaryType anniversaryType) ;
		
	public void deleteAnni(Integer id);
	
	public AnniversaryType getAnni(Integer id); 
	
	public List<AnniversaryType> getAllAnni();
	
	public AnniversaryType updateAnni(AnniversaryType anniversaryType,Integer id);
		
	
		
	
	

}
