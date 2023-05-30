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
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	StaffDAO dao;
	
	@RequestMapping("/list.json")
	public List<StaffVO> staffList(int use_work_num){
		return dao.staffList(use_work_num);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void update(@RequestBody StaffVO vo) {
		dao.update(vo);
	}
	
}
