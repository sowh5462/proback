package com.example.dao;

import java.util.List;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.CheckVO;

@Repository
public class CheckDAOImpl implements CheckDAO{
	
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.CheckMapper";
	
	@Override
	public List<CheckVO> annualList(int use_work_num, int page, int size) {
		HashMap<String,Object> map= new HashMap<String, Object>();
		map.put("use_work_num", use_work_num);
		map.put("start", (page-1)*size);
		map.put("size",size);
		return session.selectList(namespace+".annualList",map);
	}

	@Override
	public int confirmCheck(int use_id) {
		return session.selectOne(namespace+".confirmCheck",use_id);
	}

	@Override
	public List<CheckVO> dayCheck(String chk_day, int use_work_num) {
		HashMap<String,Object> map= new HashMap<String, Object>();
		map.put("chk_day", chk_day);
		map.put("use_work_num", use_work_num);
		return session.selectList(namespace+".dayCheck",map);
	}
	
	@Override
	public List<CheckVO> checkFilter(int chk_confirm, int use_work_num) {
		HashMap<String,Object> map= new HashMap<String, Object>();
		map.put("chk_confirm", chk_confirm);
		map.put("use_work_num", use_work_num);
		return session.selectList(namespace+".checkFilter",map);
	}

	@Override
	public List<CheckVO> checkUser(int use_id) {
		return session.selectList(namespace+".checkUser",use_id);
	}

	@Override
	public void confirmUpdate(CheckVO vo) {
		session.update(namespace+".confirmUpdate",vo);
	}
	
	

	

}
