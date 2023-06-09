package com.example.dao;

import java.util.HashMap;
import java.util.List;


import com.example.domain.ScheduleVO;
import com.example.domain.UserVO;



public interface ScheduleDAO {
	public List<ScheduleVO> scheduleList(int use_id);
	public List<HashMap<String, Object>> scheduleList1(int use_work_num);
	public List<ScheduleVO> scheCheck(String sche_start, int use_work_num);
	public List<UserVO> userList(int use_work_num);
	public void scheInsert(ScheduleVO vo);
	
	
	
}
