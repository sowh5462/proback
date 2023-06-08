package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.dao.PayDAO;

@RestController
@RequestMapping("/payroll")
public class PayController {
	@Autowired
	PayDAO dao;
	
	@RequestMapping("/sum")
	public String paySum(int use_work_num) {
		return dao.paySum(use_work_num);
	}
	@RequestMapping("/total")
	public int staffTotal(int use_work_num) {
		return dao.staffTotal(use_work_num);
	}
	@RequestMapping("/temp")
	public String tempPaySum(int use_work_num) {
		return dao.tempPaySum(use_work_num);
	}
	@RequestMapping("/type")
	public List<HashMap<String, Object>> staffType(int use_work_num) {
		return dao.staffType(use_work_num);
	}
	@RequestMapping("/month")
	public List<HashMap<String, Object>> payMonth(int use_work_num) {
		return dao.payMonth(use_work_num);
	}
	@RequestMapping("/info")
	public List<HashMap<String, Object>> payInfo(int use_work_num) {
		return dao.payInfo(use_work_num);
	}

}
