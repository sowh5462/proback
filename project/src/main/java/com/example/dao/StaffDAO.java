package com.example.dao;

import java.util.List;

import com.example.domain.StaffVO;
import com.example.domain.UserVO;

public interface StaffDAO {
	public List<StaffVO> staffList(int use_work_num);
	public void use_Update(UserVO vo);
	public void sta_Update(StaffVO vo);
	public int annual(int use_id);
}
