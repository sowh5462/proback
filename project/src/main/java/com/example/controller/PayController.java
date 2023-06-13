package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.dao.PayDAO;
import com.example.domain.PayVO;
import com.example.domain.StubVO;

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
	@RequestMapping("/stubList.json")
	public List<HashMap<String, Object>> payStub(String stub_name, int use_work_num ){
		return dao.payStub(stub_name, use_work_num);
	}
	@RequestMapping("/staff")
	public HashMap<String, Object> staffPay(String use_name, int use_work_num){
		return dao.staffPay(use_name, use_work_num);
	}
	@RequestMapping("/more")
	public int payMore(String use_name, int use_work_num) {
	    Integer result = dao.payMore(use_name, use_work_num);

	    return result != null ? result : 0;
	}
	@RequestMapping(value="/stub/insert", method=RequestMethod.POST)
	public void insertStub(@RequestBody StubVO vo) {
		dao.insertStub(vo);
	}
	@RequestMapping(value="/pay/insert", method=RequestMethod.POST)
	public void insertPay(@RequestBody PayVO vo) {
		dao.insertPay(vo);
	}
	@RequestMapping("/staff/stub/list.json")
	public List<HashMap<String, Object>> staffStub(int use_id){
		return dao.staffStub(use_id);
	}
	@RequestMapping("/chart")
	public List<HashMap<String, Object>> payChart(int use_id){
		return dao.payChart(use_id);
	}
	@RequestMapping("/today")
	public List<HashMap<String, Object>> payToday(int use_id){
		return dao.payToday(use_id);
	}
	@RequestMapping("/paymonth")
	public int payMonth(int use_id, String date) {
		return dao.payMonth(use_id, date);
	}

}
