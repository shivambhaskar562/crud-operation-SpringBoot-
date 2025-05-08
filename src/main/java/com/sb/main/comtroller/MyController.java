package com.sb.main.comtroller;

import com.sb.main.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	PassengerService passengerService;

	//Testing page for checking
	@GetMapping("/hello")
	public String TestPage() {
		passengerService.addPassenger(null);
		
		return "home page";
	}
}
