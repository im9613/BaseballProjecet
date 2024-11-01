package com.test.kbo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KboTest {
	
	@GetMapping("/main.do")
	public String main() {
		return "main";
	}
	

	
}
