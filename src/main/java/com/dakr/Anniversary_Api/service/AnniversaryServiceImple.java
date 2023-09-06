package com.dakr.Anniversary_Api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.Anniversary_Api.entity.AnniversaryType;
import com.dakr.Anniversary_Api.repository.AnniRepository;

@Service
public class AnniversaryServiceImple implements AnniversaryService{
	
	@Autowired 
	private AnniRepository repository;

	@Override
	public AnniversaryType saveAnni(AnniversaryType anniversaryType) {
		AnniversaryType anniversaryType2=repository.save(anniversaryType);
		return anniversaryType2;
	}

	@Override
	public void deleteAnni(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public AnniversaryType getAnni(Integer id) {
		AnniversaryType type=repository.findById(id).get();
		return type;
	}

	@Override
	public List<AnniversaryType> getAllAnni() {
		List<AnniversaryType> list=repository.findAll();
		return list;
	}

	@Override
	public AnniversaryType updateAnni(AnniversaryType anniversaryType, Integer id) {
		AnniversaryType anniversaryType2=repository.findById(id).get();
		
		anniversaryType2.setAnniType_id(id);
		anniversaryType2.setBest_sellerAnni(anniversaryType.getBest_sellerAnni());
		anniversaryType2.setAnni_cakes(anniversaryType.getAnni_cakes());
		anniversaryType2.setFirst_anniCake(anniversaryType.getFirst_anniCake());
		anniversaryType2.setAnni_flowers(anniversaryType.getAnni_flowers());
		anniversaryType2.setChocol_bouquet(anniversaryType.getChocol_bouquet());
		anniversaryType2.setTwentyFifth_anni_cakes(anniversaryType.getTwentyFifth_anni_cakes());
		
		return repository.save(anniversaryType2);
	}

}
