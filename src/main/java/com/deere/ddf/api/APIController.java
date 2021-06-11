package com.deere.ddf.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class APIController {
	
	
	@GetMapping("/version")
	public String hello() {
		
		return"<h1>Hello DDF</h1>";
	} 

}
