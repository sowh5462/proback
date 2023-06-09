package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EventDAO;
import com.example.domain.EventVO;

@RestController
@RequestMapping("/event")
public class EventController {
	@Autowired
	EventDAO dao;
	
	@RequestMapping("/")
	public List<EventVO> event(String event_start, int use_work_num) {
		return dao.event(event_start, use_work_num);
	}
	
	@RequestMapping("/list.json")
	public List<EventVO> list(){
		return dao.list();
	}
	
		
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void insert(@RequestBody EventVO vo) {
		dao.insert(vo);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public void update(@RequestBody EventVO vo) {
		dao.update(vo);
	}
	
	@RequestMapping("/delete")
	public void delete(int event_id) {
		dao.delete(event_id);
	}
}
