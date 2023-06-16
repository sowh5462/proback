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
import com.example.dao.UserDAO;
import com.example.domain.ScheduleVO;
import com.example.domain.StaffVO;
import com.example.domain.UserVO;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
	
	@Autowired
	ScheduleDAO dao;
	UserDAO udao;
	
	@RequestMapping("/list.json")
	public List<ScheduleVO> scheduleList(int use_id){
		return dao.scheduleList(use_id);
	}
	
	@RequestMapping("/list1.json")
	public List<HashMap<String, Object>> scheduleList1(int use_work_num){
		return dao.scheduleList1(use_work_num);
	}
	
	@RequestMapping("/schelist")
	public List<ScheduleVO> scheCheck(String sche_start, int use_work_num){
		return dao.scheCheck(sche_start, use_work_num);
	}
	
	@RequestMapping("/userList")
	public List<UserVO> userList(int use_work_num){

		return dao.userList(use_work_num);
			
	}
	
	@RequestMapping("/scheduleList2")
	public List<UserVO> scheduleList2(int use_id){
		return dao.userList(use_id);
	}
	
	
	@RequestMapping(value="/scheInsert", method=RequestMethod.POST)
	public void schInsert(ScheduleVO vo) {
		try {
			dao.scheInsert(vo);
		} catch(Exception e) {
			System.out.print("insert오류:"+e.toString());
		}
		
	}
	
	@RequestMapping("/listStaff.json")
	public List<ScheduleVO> scheduleListStaff(int use_id){
		return dao.scheduleListStaff(use_id);
	}
	
	
	
	
	
}
