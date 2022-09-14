package com.app.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoController {
	
	
	@GetMapping("/name")
	public String getName() {
		return "Play Java !";

}
	
	@GetMapping("/address")
	public String getAddress() {
		return "India !";

}
	@GetMapping("/status")
	public String getStatus() {
		return "active !";

}
	
}
