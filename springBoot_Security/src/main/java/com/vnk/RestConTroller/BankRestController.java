package com.vnk.RestConTroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
	@GetMapping("/")
public String home() {
	return "WELCOME TO VNK BANK";
}
}
