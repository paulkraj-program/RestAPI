package com.deere.ddf.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api")
@Api(description="API's to get the json resprenstation of pages in www.deere.com pages")
public class APIController {
	
	
	@GetMapping("/version")
	public String hello() {
		
		return"1.0";
	} 

}
