package com.dakr.Anniversary_Api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dakr.Anniversary_Api.entity.AnniversaryRelation;

@Service
public interface AnniRelationService  {

    public AnniversaryRelation saveRelation(AnniversaryRelation relation);
	
	public void deleteRelation(Integer id);
	
    public AnniversaryRelation getRelation(Integer id); 
	
	public List<AnniversaryRelation> getAllRelation();
	
	public AnniversaryRelation updateRelation(AnniversaryRelation relation,Integer id);
	
		
}
