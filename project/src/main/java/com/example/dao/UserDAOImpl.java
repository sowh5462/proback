package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.StaffVO;
import com.example.domain.UserVO;
import com.example.domain.WorkplaceVO;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	SqlSession session;
	String namespace = "com.example.mapper.UserMapper";

	@Override
	public List<StaffVO> staffList() {
		
		return session.selectList(namespace + ".staffList");
	}

	@Override
	public void uinsert(UserVO vo) {
		session.insert(namespace + ".uinsert", vo);
		
	}

	@Override
	public void winsert(WorkplaceVO vo) {
		session.insert(namespace + ".winsert", vo);
		
	}

	@Override
	public HashMap<String, Object> wread(String use_login_id, int use_type) {
		return session.selectOne(namespace + ".wread", use_login_id);
	}
	
}
