package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.WorkPlaceDAO;
import com.example.domain.WorkplaceVO;

@RestController
@RequestMapping("/workplace")
public class WorkPlaceController {
	@Autowired
	WorkPlaceDAO dao;
	
	@RequestMapping("/")
	public WorkplaceVO workplace(int use_id) {
		return dao.workplace(use_id);
	
	}

}