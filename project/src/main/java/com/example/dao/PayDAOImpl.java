package com.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PayDAOImpl implements PayDAO {
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.PayMapper";
	
	@Override
	public int paySum(int use_work_num) {
		return session.selectOne(namespace+".paySum", use_work_num);
	}
	@Override
	public int staffTotal(int use_work_num) {
		return session.selectOne(namespace+".staffTotal", use_work_num);
	}
}
