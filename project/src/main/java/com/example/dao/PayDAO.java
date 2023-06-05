package com.example.dao;

import java.util.HashMap;
import java.util.List;

public interface PayDAO {
	public String paySum(int use_work_num);
	public int staffTotal(int use_work_num);
	public String tempPaySum(int use_work_num);
	public List<HashMap<String, Object>> staffType(int use_work_num);
	public List<HashMap<String, Object>> payMonth(int use_work_num);
	public List<HashMap<String, Object>> payInfo(int use_work_num);
}
