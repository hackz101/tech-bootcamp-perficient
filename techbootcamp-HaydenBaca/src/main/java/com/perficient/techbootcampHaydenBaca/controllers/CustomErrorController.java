package com.perficient.techbootcampHaydenBaca.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class CustomErrorController implements ErrorController{

	@GetMapping("/error")
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleError() {
		return "error.html";
	}
	
	
}
