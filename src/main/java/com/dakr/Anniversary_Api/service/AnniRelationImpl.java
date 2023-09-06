package com.dakr.Anniversary_Api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dakr.Anniversary_Api.entity.AnniversaryRelation;
import com.dakr.Anniversary_Api.repository.AnniRelationRepository;

@Repository
public class AnniRelationImpl implements AnniRelationService {
	
	
	@Autowired
	private AnniRelationRepository repository;

	@Override
	public AnniversaryRelation saveRelation(AnniversaryRelation relation) {
		AnniversaryRelation relation2=repository.save(relation);
		return relation2;
	}

	@Override
	public void deleteRelation(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public AnniversaryRelation getRelation(Integer id) {
		AnniversaryRelation relation=repository.findById(id).get();
		return relation;
	}

	@Override
	public List<AnniversaryRelation> getAllRelation() {
		List<AnniversaryRelation> list=repository.findAll();
		return list;
	}

	@Override
	public AnniversaryRelation updateRelation(AnniversaryRelation relation, Integer id) {
		AnniversaryRelation relation2=repository.findById(id).get();
		
		relation2.setRelation_id(id);
		relation2.setWife(relation.getWife());
		relation2.setHusband(relation.getHusband());
		relation2.setParents(relation.getParents());
		relation2.setBhaiya_bhabhi(relation.getBhaiya_bhabhi());
		relation.setDidi_jiju(relation.getDidi_jiju());
		relation2.setParents(relation.getParents());
		return repository.save(relation2);
	}

}
