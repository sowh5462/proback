package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.StaffDAO;
import com.example.domain.StaffVO;
import com.example.domain.UserVO;

@RestController
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	StaffDAO dao;
	
	@RequestMapping("/list.json")
	public List<StaffVO> staffList(int use_work_num){
		return dao.staffList(use_work_num);
	}
	
	
	@RequestMapping(value="/use_Update", method=RequestMethod.POST)
	   public void use_Update(@RequestBody UserVO vo) {
		
		   try {
			   System.out.println(vo.toString());
			dao.use_Update(vo);
		} catch (Exception e) {
			System.out.println("유저정보수정:"+e.toString());
		}
	   }
	
	@RequestMapping(value="/sta_Update", method=RequestMethod.POST)
	   public void sta_Update(@RequestBody StaffVO vo) {
		   try {
			dao.sta_Update(vo);
		} catch (Exception e) {
			System.out.println("유저정보수정(스탭):"+e.toString());
		}
	   }
	
	@RequestMapping("/annual")
	public int annual(int use_id) {
		return dao.annual(use_id);	
	}
	
	@RequestMapping(value="/annual/update", method=RequestMethod.POST)
	   public void annualUpdate(@RequestBody StaffVO vo) {
		   try {
			dao.annualUpdate(vo);
		} catch (Exception e) {
			System.out.println("연차정보수정:"+e.toString());
		}
	   }
	
	
}
