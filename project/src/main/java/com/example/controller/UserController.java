package com.example.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserDAO;
import com.example.domain.StaffVO;
import com.example.domain.UserVO;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserDAO dao;
	
	@RequestMapping("/staff/list.json")
	public List<StaffVO> staffList(){
		return dao.staffList();
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	   public int[] login(@RequestBody UserVO vo) {
	      int[] result = new int[2]; //아이디 없는경우
	      HashMap<String, Object> map=dao.wread(vo.getUse_login_id(), vo.getUse_type());
	      
	      result[0] = 0;
	      if(map != null) {
	         if(map.get("use_login_pass").equals(vo.getUse_login_pass())) {
	            result[0]=1; //성공
	         }else {
	            result[0]=2; //비번틀림
	         }

	         if(map.get("use_type").equals(1)){
	        	 result[1] = 1; // 사장
	   
	         	}else{
	         		result[1] = 0; // 직원
	         	}
	      }
	      return result;
	   }
	@RequestMapping("/read")
	public HashMap<String,Object> wread(String use_login_id, int use_type){
		return dao.wread(use_login_id, use_type);
	}
}
