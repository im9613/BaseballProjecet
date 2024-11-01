package com.test.kbo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home.do")
	private String home( ) {
		
		return "home";
	}
	
}
