package com.example.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ScheduleDAO;
import com.example.dao.StaffDAO;
import com.example.dao.TimeDAO;
import com.example.dao.UserDAO;
import com.example.domain.TimeVO;

@RestController
@RequestMapping("/time")
public class TimeController {
	
	@Autowired
	TimeDAO dao;


	//출퇴근 버튼 클릭시
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	   public void insert(@RequestBody TimeVO vo) {
		   try {
			dao.tinsert(vo);
		} catch (Exception e) {
			System.out.println("출근관리:"+e.toString());
		}
	 }
	@RequestMapping(value="/update", method=RequestMethod.POST)
	   public void update(@RequestBody TimeVO vo) {
		   try {
			dao.tupdate(vo);
		} catch (Exception e) {
			System.out.println("퇴근관리:"+e.toString());
		}
	 }
	@RequestMapping("/list.json")
	   public List<TimeVO> tread(int use_id){
		   return dao.tread(use_id);
	}
	
}
