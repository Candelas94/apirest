package com.example.apirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.apirest.dto.User;
import com.example.apirest.security.JWTAuthtenticationConfig;

@RestController
public class LoginController {
@Autowired
	JWTAuthtenticationConfig jwtAuthtenticationConfig;

	
	@CrossOrigin(origins = "http://192.168.1.154:8081")
	@PostMapping("login")
	public User login(
			@RequestParam("user") String username,
			@RequestParam("encryptedPass") String encryptedPass) {

		String token = jwtAuthtenticationConfig.getJWTToken(username);
		return new User(username, encryptedPass,token);		
	}
}
