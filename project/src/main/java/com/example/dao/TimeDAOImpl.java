package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.TimeVO;

@Repository
public class TimeDAOImpl implements TimeDAO{
	@Autowired
	SqlSession session;
	String namespace = "com.example.mapper.TimeMapper";
	
	
	@Override
	public void tinsert(TimeVO vo) {
		session.insert(namespace + ".tinsert", vo);
	}

	@Override
	public void tupdate(TimeVO vo) {
		session.update(namespace + ".tupdate", vo);
	}

	@Override
	public List<TimeVO> tread(int use_id) {
		return session.selectList( namespace + ".tread", use_id);
	}
	
}
