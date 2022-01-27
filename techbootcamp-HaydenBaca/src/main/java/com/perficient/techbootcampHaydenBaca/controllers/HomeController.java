package com.perficient.techbootcampHaydenBaca.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.perficient.techbootcampHaydenBaca.DogAndOwner;
import com.perficient.techbootcampHaydenBaca.entities.DogEntity;
import com.perficient.techbootcampHaydenBaca.entities.OwnerEntity;
import com.perficient.techbootcampHaydenBaca.services.DogService;

@Controller
public class HomeController {
	
	@Autowired
	DogService dogService;

	@GetMapping("/")
	public String getAllDogs(Model model) {
		List<DogEntity> dogList = new ArrayList<>();
		List<DogAndOwner> dogAndOwnerList = new ArrayList<>();
		
		dogList.addAll(dogService.getAllDogs());
		for (int i = 0; i < dogList.size(); i++) {
			dogAndOwnerList.add(new DogAndOwner(dogList.get(i), dogService.getOwnerById(dogList.get(i).getDogOwner())));
		}
		dogList.clear();
		model.addAttribute("dogs", dogAndOwnerList);
		return "home.html";
	}
	
	@RequestMapping(value = "/addDog", method = RequestMethod.GET)
	public String showAddDogPage(Model model) {
		List<OwnerEntity> ownerList = new ArrayList<>();
		ownerList.addAll(dogService.getAllOwners());
		model.addAttribute("owners", ownerList);
		return "adddog.html";
	}
	
	@RequestMapping(value = "/addDog", method = RequestMethod.POST)
	public String addDog(HttpServletRequest request) {
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		int age = Integer.parseInt(request.getParameter("age"));
		int owner = Integer.parseInt(request.getParameter("ownerID"));
		dogService.addDog(name, breed, age, owner);
		return "redirect:/";
	
	}
	
	@RequestMapping(value = "/removeDog", method = RequestMethod.GET)
	public String showRemoveDogPage(Model model) {
		List<DogEntity> dogList= new ArrayList<>();
		dogList.addAll(dogService.getAllDogs());
		model.addAttribute("dogs", dogList);
		List<OwnerEntity> ownerList= new ArrayList<>();
		ownerList.addAll(dogService.getAllOwners());
		model.addAttribute("dogs", dogList);
		return "removedog.html";
	}
	
	@RequestMapping(value = "/removeDog", method = RequestMethod.POST)
	public String removeDog(HttpServletRequest request) {
		String inputID = request.getParameter("dog");
		if (!(inputID == null)) {
			int dogID = Integer.parseInt(request.getParameter("dog"));
			dogService.removeDog(dogID);
		}
		return "redirect:/";
	}
}
