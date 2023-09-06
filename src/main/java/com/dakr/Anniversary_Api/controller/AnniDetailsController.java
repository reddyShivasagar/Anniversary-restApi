package com.dakr.Anniversary_Api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dakr.Anniversary_Api.entity.AnniversaryDetails;
import com.dakr.Anniversary_Api.service.AnniDetailsImpl;



public class AnniDetailsController {

	@Autowired
	private AnniDetailsImpl service;
	
	@PostMapping("/Save")
	public AnniversaryDetails save(@RequestBody AnniversaryDetails details) {
		return service.saveDetails(details);
		
	}
	
	
	@DeleteMapping("/Delete/{id}")
	public void delete(@PathVariable Integer id) {
		service.deleteDetails(id);
		
		
	}
	
	@GetMapping("/Get/{id}")
	public AnniversaryDetails get(@PathVariable Integer id) {
		return service.getDetails(id);
		
	}
	
	@GetMapping("/Get")
	public List<AnniversaryDetails> getAll() {
		return service.getAllDetails();
		
	}
	
	@PutMapping("/Update/{id}")
	public AnniversaryDetails update(@RequestBody AnniversaryDetails details, @PathVariable Integer id) {
		return service.updateDetails(details, id);
		
	}
}
