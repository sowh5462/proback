package com.example.dao;

import java.util.HashMap;
import java.util.List;
import com.example.domain.TimeVO;

public interface TimeDAO {
    public void tinsert(TimeVO vo);
    public void tupdate(TimeVO vo);
    public List<TimeVO> tread(int use_id);
};