package com.perficient.techbootcampHaydenBaca.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perficient.techbootcampHaydenBaca.entities.DogEntity;
import com.perficient.techbootcampHaydenBaca.services.DogService;

@RestController
public class HomeController {
	
	@Autowired
	DogService dogService;

	@GetMapping("/")
	public String home() {

		return "home.html";
	}
	
	@GetMapping("/getAllDogs")
	public List<DogEntity> getAllDogs() {
		List<DogEntity> dogList = new ArrayList<>();
		dogList.addAll(dogService.getAllDogs());
		return dogList;
	}
	
	@GetMapping("/addDog")
	public boolean addDog() {
		return dogService.addDog();
	}
	
}
