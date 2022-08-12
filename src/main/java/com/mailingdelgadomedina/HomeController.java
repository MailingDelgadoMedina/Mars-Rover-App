package com.mailingdelgadomedina;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	//This is a Get request
	
	@GetMapping("/" )
	public String getHomeView (ModelMap model) {
		/*The parameters first had Model and on line 19 was .addAttribute the method
		 * instead of put*/
		/*Line 19 is the model that acts like a json 
		 * object name being the key an my name the value*/
		model.put("name", "Mailing Delgado");
		return "index";
		
	}
	
}
