package com.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.WorkplaceVO;

@Repository
public class WorkPlaceDAOImpl implements WorkPlaceDAO{
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.WorkPlaceMapper";
	
	@Override
	public WorkplaceVO workplace(int use_id) {
		return session.selectOne(namespace+".workplace", use_id);
	}
	
	
}
