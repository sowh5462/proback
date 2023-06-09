package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.ScheduleVO;
import com.example.domain.StaffVO;
import com.example.domain.UserVO;

@Repository
public class ScheduleDAOImpl implements ScheduleDAO {
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.ScheduleMapper";
	@Override
	public List<ScheduleVO> scheduleList(int use_id) {
		return session.selectList(namespace + ".scheduleList", use_id);
	}
	@Override
	public List<HashMap<String, Object>> scheduleList1(int use_work_num) {
		return session.selectList(namespace + ".scheduleList1", use_work_num);
	}
	@Override
	public List<ScheduleVO> scheCheck(String sche_start, int use_work_num) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("sche_start", sche_start);
		map.put("use_work_num", use_work_num);
		return session.selectList(namespace+ ".scheCheck", map); 
	}
	@Override
	public List<UserVO> userList(int use_work_num) {
		return session.selectList(namespace+ ".userList", use_work_num) ;
	}
	@Override
	public void scheInsert(ScheduleVO vo) {
		session.insert(namespace+".scheInsert", vo);
		
	}
	
	
	
	
		
	}
	
	

