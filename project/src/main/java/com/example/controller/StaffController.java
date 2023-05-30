package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.StaffDAO;
import com.example.domain.StaffVO;

@RestController
@RequestMapping("/user")
public class StaffController {
	@Autowired
	StaffDAO dao;
	
	@RequestMapping("/staff/list.json")
	public List<StaffVO> staffList(){
		return dao.staffList();
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void update(@RequestBody StaffVO vo) {
		dao.update(vo);
	}
	
}
