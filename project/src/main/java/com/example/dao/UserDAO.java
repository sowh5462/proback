package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.domain.StaffVO;
import com.example.domain.UserVO;
import com.example.domain.WorkplaceVO;

public interface UserDAO {
   public HashMap<String, Object> wread(String use_login_id);
   public HashMap<String, Object> sread(String use_login_id);
   public HashMap<String, Object> uread(String use_login_id);
   public void uinsert(UserVO vo);
   public void winsert(WorkplaceVO vo);
   public void sinsert(StaffVO vo);
   public void wupdate(UserVO vo);
   public void supdate(StaffVO vo);
   public int lastnum();
}
