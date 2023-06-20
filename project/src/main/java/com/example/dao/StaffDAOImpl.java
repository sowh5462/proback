package com.example.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.StaffVO;
import com.example.domain.UserVO;

@Repository
public class StaffDAOImpl implements StaffDAO {
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.StaffMapper";
	
	@Override
	public List<StaffVO> staffList(int use_work_num) {
		return session.selectList(namespace + ".staffList", use_work_num);
	}

	@Override
	public void use_Update(UserVO vo) {
		session.update(namespace + ".use_Update", vo);
		
	}

	@Override
	public void sta_Update(StaffVO vo) {
		session.update(namespace + ".sta_Update", vo);
		
	}

	@Override
	public int annual(int use_id) {
	
		return session.selectOne(namespace+".annual",use_id);
	}

		
	}
	
	

