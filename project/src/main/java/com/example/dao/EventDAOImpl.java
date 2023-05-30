package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.EventVO;

@Repository
public class EventDAOImpl implements EventDAO{
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.EventMapper";
	
	@Override
	public List<EventVO> list() {
		return session.selectList(namespace+".list");
	}
	
	
}
