package com.example.dao;

import java.util.List;

import com.example.domain.CheckVO;
import com.example.domain.StaffVO;

public interface CheckDAO {
	public List<CheckVO> annualList(int use_work_num, int page, int size);
	public int count(int use_work_num);
	public List<CheckVO> checkList(int use_work_num);
	public int confirmCheck(int use_id);
	public List<CheckVO> dayCheck(String chk_day, int use_work_num);
	public List<CheckVO> checkFilter(int chk_confirm, int use_work_num);
	public List<CheckVO> checkUser(int use_id);
	public void confirmUpdate(CheckVO vo);
	public void annualUpdate(StaffVO vo);
	public void insert(CheckVO vo);
	public List<CheckVO> staffCheck(int use_id);
}
