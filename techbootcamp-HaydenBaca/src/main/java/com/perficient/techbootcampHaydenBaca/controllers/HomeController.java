package com.perficient.techbootcampHaydenBaca.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.perficient.techbootcampHaydenBaca.entities.DogEntity;
import com.perficient.techbootcampHaydenBaca.services.DogService;

@Controller
public class HomeController {
	
	@Autowired
	DogService dogService;

	@GetMapping("/")
	public String getAllDogs(Model model) {
		List<DogEntity> dogList = new ArrayList<>();
		dogList.addAll(dogService.getAllDogs());
		model.addAttribute("dogs", dogList);
		System.out.println(model.getAttribute("dogs"));
		return "home.html";
	}
	
	/*@RequestMapping(value = "/addDog", method = RequestMethod.GET)
	public String showAddDogPage(Model model) {
		model.addAttribute("dog", new DogEntity());
		
		return "dog";
	}*/
	@GetMapping("/addDog")
	public boolean addDog() {
		return dogService.addDog();
	}
	
}
