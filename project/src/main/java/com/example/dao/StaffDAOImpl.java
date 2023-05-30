package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.StaffVO;

@Repository
public class StaffDAOImpl implements StaffDAO {
	@Autowired
	SqlSession session;
	String namespace = "com.example.mapper.StaffMapper";
	@Override
	public List<StaffVO> staffList() {
		return session.selectList(namespace + ".staffList");
	}
	@Override
	public void update(StaffVO vo) {
		session.update(namespace + ".update", vo);
		
	}
}
