package com.example.dao;

import java.util.HashMap;
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

	@Override
	public void insert(EventVO vo) {
		session.insert(namespace+".insert",vo);
		
	}

	@Override
	public void update(EventVO vo) {
		session.update(namespace+".update",vo);
		
	}

	@Override
	public void delete(int event_id) {
		session.delete(namespace+".delete",event_id);
		
	}

	@Override
	public List<EventVO> event(String event_start, int use_work_num) {
		HashMap<String,Object> map= new HashMap<String, Object>();
		map.put("event_start", event_start);
		map.put("use_work_num", use_work_num);
		return session.selectList(namespace+".event", map);
	}
	
	
}
