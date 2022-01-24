package com.perficient.techbootcampHaydenBaca;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class GreetingTwoController {
	
	@GetMapping("/greetingtwo")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		model.addAttribute("name", name);
		return "greeting";
	}

}
