package com.mailingdelgadomedina;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	//This is a Get request
	
	@GetMapping("/" )
	public String getHomeView () {
		return "index";
		
	}
	
}
