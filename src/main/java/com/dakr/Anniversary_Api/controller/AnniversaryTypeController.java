package com.dakr.Anniversary_Api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.Anniversary_Api.entity.AnniversaryType;
import com.dakr.Anniversary_Api.service.AnniversaryServiceImple;

@RestController
public class AnniversaryTypeController {

	@Autowired
	private AnniversaryServiceImple service;

	@PostMapping("/Save")
	public AnniversaryType save(@RequestBody AnniversaryType anniversaryType) {
		return service.saveAnni(anniversaryType);

	}

	@DeleteMapping("/Delete/{id}")
	public void delete(@PathVariable Integer id) {
		service.deleteAnni(id);

	}

	@GetMapping("/Get/{id}")
	public AnniversaryType getAnniversary(@PathVariable Integer id) {
		return service.getAnni(id);

	}

	@GetMapping("/Get")
	public List<AnniversaryType> getAllAnni() {
		return service.getAllAnni();

	}

	@PutMapping("/Update/{id}")
	public AnniversaryType Update(@RequestBody AnniversaryType anniversaryType, @PathVariable Integer id) {
		return service.updateAnni(anniversaryType, id);

	}

}
