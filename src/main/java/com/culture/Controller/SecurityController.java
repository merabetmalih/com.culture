package com.culture.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SecurityController {
	@GetMapping("/403")
	public String notAutorized() {
		return "403";
		
	}

	
	

}
