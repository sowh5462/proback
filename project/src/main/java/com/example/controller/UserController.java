package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserDAO;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserDAO dao;
	
	
}
