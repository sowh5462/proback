package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.PayDAO;

@RestController
@RequestMapping("/payroll")
public class PayController {
	@Autowired
	PayDAO dao;
	
	@RequestMapping("/sum")
	public int paySum(int use_work_num) {
		return dao.paySum(use_work_num);
	}
	@RequestMapping("/total")
	public int staffTotal(int use_work_num) {
		return dao.staffTotal(use_work_num);
	}

}
