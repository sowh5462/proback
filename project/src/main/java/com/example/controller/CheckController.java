package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.CheckDAO;
import com.example.domain.CheckVO;

@RestController
@RequestMapping("/check")
public class CheckController {

	@Autowired
	CheckDAO dao;
	
	@RequestMapping("/list.json")
	public List<CheckVO> annualList(int use_work_num, int page, int size) {
		return dao.annualList(use_work_num, page, size);
	}
	
	@RequestMapping("/confirm")
	public int confirmCheck(int use_id) {
		return dao.confirmCheck(use_id);
	}
	
	@RequestMapping("/daylist")
	public List<CheckVO> checkList(String chk_day, int use_work_num){
		return dao.dayCheck(chk_day, use_work_num);
	}
	
	@RequestMapping("/filter")
	public List<CheckVO> checkFilter(int chk_confirm, int use_work_num){
		return dao.checkFilter(chk_confirm, use_work_num);
	}
	
	@RequestMapping("/user")
	public List<CheckVO> checkUser(int use_id) {
		return dao.checkUser(use_id);
	}
	
	@RequestMapping(value="/update" , method=RequestMethod.POST)
	public void confirmUpdate(@RequestBody CheckVO vo) {
		dao.confirmUpdate(vo);
	}
}
