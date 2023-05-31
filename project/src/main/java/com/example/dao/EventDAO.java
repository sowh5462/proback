package com.example.dao;

import java.util.List;

import com.example.domain.EventVO;

public interface EventDAO {
  public List<EventVO> list();
  public EventVO event(int event_id);
  public void insert(EventVO vo);
  public void update(EventVO vo);
  public void delete(int event_id);
}
