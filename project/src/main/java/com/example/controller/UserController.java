package com.example.controller;


import java.io.File;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.dao.UserDAO;
import com.example.domain.StaffVO;
import com.example.domain.UserVO;
import com.example.domain.WorkplaceVO;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserDAO dao;
	
	//로그인체크   
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public HashMap<String, Object> login(@RequestBody UserVO vo) {
		//result는 보내줄값, use는 받아온 정보
		HashMap<String, Object> result = new HashMap<String, Object>();
		HashMap<String, Object> user = dao.uread(vo.getUse_login_id());
		
		// 존재하지 않는 경우
		if (user == null) {
			result.put("status", 0);
		} else {
			// 비밀번호 일치
			if (user.get("use_login_pass").equals(vo.getUse_login_pass())) {
				result.put("status", 1);				
				// 사장 직원 여부
				if (user.get("use_type").equals(1)) {
					result.put("role", 1); // 사장
					result.put("use_id", user.get("use_id"));
					result.put("use_work_num", user.get("use_work_num"));
				} else {
					result.put("role", 0); // 직원
					result.put("use_id", user.get("use_id"));
					result.put("use_work_num", user.get("use_work_num"));
				}
			} else {
				// 비밀번호 불일치
				result.put("status", 2);
			}
		}		
		return result;
		}
	
	
		//회원정보
	   @RequestMapping("/uread")
	   public HashMap<String, Object> uread(String use_login_id){
		   return dao.uread(use_login_id);
	   }
	   
	   //사업장정보
		@RequestMapping("/wread")
	   public HashMap<String, Object> wread(String use_login_id){
		   return dao.wread(use_login_id);
	   }
		
	   //직원정보
	   @RequestMapping("/sread")
	   public HashMap<String, Object> sread(String use_login_id){
		   return dao.sread(use_login_id);
	   }
	      
	   //회원정보 업데이트
	   @RequestMapping(value="/wupdate", method=RequestMethod.POST)
	   public void wupdate(@RequestBody UserVO vo) {
			dao.wupdate(vo);	
	   }
	   
	   //유저정보 등록
	   @RequestMapping(value="/register", method=RequestMethod.POST)
	   public void insert(@RequestBody UserVO vo) {
	      dao.uinsert(vo);
	   }
	   
	   //사업자정보 등록
	   @RequestMapping(value="/register/workplace", method=RequestMethod.POST)
	   public void insert(@RequestBody WorkplaceVO vo) {
	      dao.winsert(vo);
	   }
	   
	   //직원정보 등록
	   @RequestMapping(value = "/register/staff", method = RequestMethod.POST)
	   public void insertStaff(@RequestBody StaffVO vo, MultipartHttpServletRequest multi) {
	      try {
	         MultipartFile file = multi.getFile("file");
	         if (file != null) {
	            String path = "c:/images/photos/";
	            String fileName = System.currentTimeMillis() + ".jpg";
	            file.transferTo(new File(path + fileName));
	            vo.setSta_image(fileName);
	         }
	         System.out.println("Staff Registration Request: " + vo); 
	         dao.sinsert(vo);
	      } catch (Exception e) {
	         System.out.println("스태프 등록 오류: " + e.toString());
	      }
	   }
	   
	   //마지막 use_id - 회원가입
	   @RequestMapping("/lastnum")
	   public int lastnum() {
		   return dao.lastnum();
	   }
}