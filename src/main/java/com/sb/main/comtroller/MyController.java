package com.sb.main.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.main.service.PassingerRepoImplementation;

@RestController
public class MyController {
	
	@Autowired
	PassingerRepoImplementation passingerRepoImplementation;
	
	//Testing page for checking
	@GetMapping("/hello")
	public String TestPage() {
		passingerRepoImplementation.addPassinfer(null);
		
		return "home page";
	}

}
