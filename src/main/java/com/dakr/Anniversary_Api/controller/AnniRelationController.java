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

import com.dakr.Anniversary_Api.entity.AnniversaryRelation;
import com.dakr.Anniversary_Api.service.AnniRelationImpl;

@RestController
public class AnniRelationController {

	@Autowired
	private AnniRelationImpl service;

	@PostMapping("/Save")
	public AnniversaryRelation save(@RequestBody AnniversaryRelation relation) {
		return service.saveRelation(relation);

	}

	@DeleteMapping("/Delete/{id}")
	public void delete(@PathVariable Integer id) {
		service.deleteRelation(id);

	}

	@GetMapping("/Get/{id}")
	public AnniversaryRelation get(@PathVariable Integer id) {
		return service.getRelation(id);

	}

	@GetMapping("/Get")
	public List<AnniversaryRelation> getAll() {
		return service.getAllRelation();

	}

	@PutMapping("/Update/{id}")
	public AnniversaryRelation update(@RequestBody AnniversaryRelation relation, @PathVariable Integer id) {
		return service.updateRelation(relation, id);

	}
}
