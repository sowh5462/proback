package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserDAO;
import com.example.domain.StaffVO;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserDAO dao;
	
	@RequestMapping("/staff/list.json")
	public List<StaffVO> staffList(){
		return dao.staffList();
	}
}
