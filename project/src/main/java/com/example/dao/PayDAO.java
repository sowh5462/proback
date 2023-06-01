package com.example.dao;

import java.util.HashMap;
import java.util.List;

public interface PayDAO {
	public int paySum(int use_work_num);
	public int staffTotal(int use_work_num);
	public int tempPaySum(int use_work_num);
	public List<HashMap<String, Object>> staffType(int use_work_num);
	public List<HashMap<String, Object>> payMonth(int use_work_num);
}
