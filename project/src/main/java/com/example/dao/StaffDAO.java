package com.example.dao;

import java.util.List;

import com.example.domain.StaffVO;

public interface StaffDAO {
	public List<StaffVO> staffList();
	public void update(StaffVO vo);
}
