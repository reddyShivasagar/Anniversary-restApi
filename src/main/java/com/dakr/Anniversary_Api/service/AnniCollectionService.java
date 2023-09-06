package com.dakr.Anniversary_Api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dakr.Anniversary_Api.entity.AnniversaryCollection;


@Service
public interface AnniCollectionService {

	public AnniversaryCollection saveCollection(AnniversaryCollection collection);
	
	public void deleteCollection(Integer id);
	
    public AnniversaryCollection getCollection(Integer id); 
	
	public List<AnniversaryCollection> getAllCollection();
	
	public AnniversaryCollection updateCollection(AnniversaryCollection collection,Integer id);
		
	
		
	
}
