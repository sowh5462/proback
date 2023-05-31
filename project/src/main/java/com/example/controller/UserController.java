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
   
   @RequestMapping("/staff/list.json")
   public List<StaffVO> staffList(){
      return dao.staffList();
   }
   
   @RequestMapping(value="/login", method=RequestMethod.POST)
   public int login(@RequestBody UserVO vo) {
      int result=0;
      HashMap<String, Object> map=dao.wread(vo.getUse_login_id());
      
      if(map != null) {
         if(map.get("use_login_pass").equals(vo.getUse_login_pass())) {
            result=1;
         }else {
            result=2;
         }
      }
      return result;
   }
   
   @RequestMapping("/read")
   public HashMap<String, Object> wread(String use_login_id){
      return dao.wread(use_login_id);
   }
   @RequestMapping(value="/register", method=RequestMethod.POST)
   public void insert(UserVO vo) {
       dao.uinsert(vo);
   }

   @RequestMapping(value="/register/workplace", method=RequestMethod.POST)
   public void insert(WorkplaceVO vo) {
       dao.winsert(vo);
   }


   @RequestMapping(value = "/register/staff", method = RequestMethod.POST)
   public void insertStaff(StaffVO vo, MultipartHttpServletRequest multi) {
       try {
           MultipartFile file = multi.getFile("file");
           if (file != null) {
               String path = "c:/images/photos/";
               String fileName = System.currentTimeMillis() + ".jpg";
               file.transferTo(new File(path + fileName));
               vo.setSta_image(fileName);
           }
           dao.sinsert(vo);
       } catch (Exception e) {
           System.out.println("스태프 등록 오류: " + e.toString());
       }
   }
}

