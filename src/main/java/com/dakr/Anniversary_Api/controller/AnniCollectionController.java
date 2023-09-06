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

import com.dakr.Anniversary_Api.entity.AnniversaryCollection;
import com.dakr.Anniversary_Api.service.AnniCollectionImpl;

@RestController
public class AnniCollectionController {

	@Autowired
	private AnniCollectionImpl service;

	@PostMapping("/Save")
	public AnniversaryCollection save(@RequestBody AnniversaryCollection collection) {
		return service.saveCollection(collection);

	}

	@DeleteMapping("/Delete/{id}")
	public void delete(@PathVariable Integer id) {
		service.deleteCollection(id);

	}

	@GetMapping("/Get/{id}")
	public AnniversaryCollection get(@PathVariable Integer id) {
		return service.getCollection(id);

	}

	@GetMapping("/Get")
	public List<AnniversaryCollection> getAll() {
		return service.getAllCollection();

	}

	@PutMapping("/Update/{id}")
	public AnniversaryCollection update(@RequestBody AnniversaryCollection collection, @PathVariable Integer id) {
		return service.updateCollection(collection, id);

	}
}
