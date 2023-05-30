package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EventDAO;
import com.example.domain.EventVO;

@RestController
@RequestMapping("/event")
public class EventController {
	@Autowired
	EventDAO dao;
	
	@RequestMapping("/list.json")
	public List<EventVO> list(){
		return dao.list();
	}
}
