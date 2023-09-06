package com.dakr.Anniversary_Api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.Anniversary_Api.entity.AnniversaryDetails;
import com.dakr.Anniversary_Api.repository.AnniDetailsRepository;


@Service
public class AnniDetailsImpl implements AnniDetailsService {

	@Autowired 
	private AnniDetailsRepository  repository;

	@Override
	public AnniversaryDetails saveDetails(AnniversaryDetails details) {
		AnniversaryDetails details2=repository.save(details);
		return details2;
	}

	@Override
	public void deleteDetails(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public AnniversaryDetails getDetails(Integer id) {
		AnniversaryDetails type=repository.findById(id).get();
		return type;
	}

	@Override
	public List<AnniversaryDetails> getAllDetails() {
		List<AnniversaryDetails> list=repository.findAll();
		return list;
	}

	@Override
	public AnniversaryDetails updateDetails(AnniversaryDetails details, Integer id) {
		AnniversaryDetails details2=repository.findById(id).get();
		
		details2.setDetails_id(id);
		details2.setPrice(details.getPrice());
		details2.setLocal_time(details.getLocal_time());
		details2.setImg(details.getImg());
		
		
		return repository.save(details2);
	}

}
