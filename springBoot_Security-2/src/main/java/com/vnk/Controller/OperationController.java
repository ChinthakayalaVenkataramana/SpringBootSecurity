package com.vnk.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class OperationController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/registerA")
	public ResponseEntity<String> registerSuccess() {
		return new ResponseEntity<String>("Successfully register....",HttpStatus.CREATED);
	}
	
	@GetMapping("/loginC")
	public String login() {
		return "loginC";
	}
	@GetMapping("/loginA")
	public ResponseEntity<?>loginSuccess(){
		return new ResponseEntity<String>("Welcome to your work place",HttpStatus.ACCEPTED);
	}
}
