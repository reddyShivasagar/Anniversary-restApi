package com.dakr.Anniversary_Api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.Anniversary_Api.entity.AnniversaryCollection;
import com.dakr.Anniversary_Api.repository.AnniCollectionRepository;

@Service
public class AnniCollectionImpl implements AnniCollectionService {
	
	
	@Autowired
	private AnniCollectionRepository repository;

	@Override
	public AnniversaryCollection saveCollection(AnniversaryCollection collection) {
		AnniversaryCollection collection2=repository.save(collection);
		return collection2;
	}

	@Override
	public void deleteCollection(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public AnniversaryCollection getCollection(Integer id) {
		AnniversaryCollection collection=repository.findById(id).get();
		return collection;
	}

	@Override
	public List<AnniversaryCollection> getAllCollection() {
		List<AnniversaryCollection> list=repository.findAll();
		return list;
	}

	@Override
	public AnniversaryCollection updateCollection(AnniversaryCollection collection, Integer id) {
		AnniversaryCollection collection2=repository.findById(id).get();
		
		collection2.setHeartShape_gifts(collection.getHeartShape_gifts());
		collection2.setCakes(collection.getCakes());
		collection2.setFlowers(collection.getFlowers());
		collection2.setPersonalised_gift(collection.getPersonalised_gift());
		collection2.setCombos(collection.getCombos());
		collection2.setChocolates(collection.getChocolates());
		collection2.setPlants(collection.getPlants());
		collection2.setPrimium_gifts(collection.getPrimium_gifts());
		collection2.setExpress_delivery(collection.getExpress_delivery());
		
		
		return repository.save(collection2);
	}

}
