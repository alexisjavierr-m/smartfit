package com.smartfit.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class PrruebaController2 {

	@GetMapping("/prrueba")
	public String prrueba() {
		return "/prrueba";
	}
	
}
