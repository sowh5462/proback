package com.example.domain;

import java.util.Date;

public class UserVO {
	private int use_id;
	private int use_work_num;
	private String use_login_id;
	private String use_login_pass;
	private String use_phone;
	private String use_name;
	private String use_birth;
	private String use_email;
	private String use_address;
	private Date use_join;
	private int use_type;
	
	
	@Override
	public String toString() {
		return "UserVO [use_id=" + use_id + ", use_work_num=" + use_work_num + ", use_login_id=" + use_login_id
				+ ", use_login_pass=" + use_login_pass + ", use_phone=" + use_phone + ", use_name=" + use_name
				+ ", use_birth=" + use_birth + ", use_email=" + use_email + ", use_address=" + use_address
				+ ", use_join=" + use_join + ", use_type=" + use_type + "]";
	}
	public int getUse_id() {
		return use_id;
	}
	public void setUse_id(int use_id) {
		this.use_id = use_id;
	}
	public int getUse_work_num() {
		return use_work_num;
	}
	public void setUse_work_num(int use_work_num) {
		this.use_work_num = use_work_num;
	}
	public String getUse_login_id() {
		return use_login_id;
	}
	public void setUse_login_id(String use_login_id) {
		this.use_login_id = use_login_id;
	}
	public String getUse_login_pass() {
		return use_login_pass;
	}
	public void setUse_login_pass(String use_login_pass) {
		this.use_login_pass = use_login_pass;
	}
	public String getUse_phone() {
		return use_phone;
	}
	public void setUse_phone(String use_phone) {
		this.use_phone = use_phone;
	}
	public String getUse_name() {
		return use_name;
	}
	public void setUse_name(String use_name) {
		this.use_name = use_name;
	}
	public String getUse_birth() {
		return use_birth;
	}
	public void setUse_birth(String use_birth) {
		this.use_birth = use_birth;
	}
	public String getUse_email() {
		return use_email;
	}
	public void setUse_email(String use_email) {
		this.use_email = use_email;
	}
	public String getUse_address() {
		return use_address;
	}
	public void setUse_address(String use_address) {
		this.use_address = use_address;
	}
	public Date getUse_join() {
		return use_join;
	}
	public void setUse_join(Date use_join) {
		this.use_join = use_join;
	}
	public int getUse_type() {
		return use_type;
	}
	public void setUse_type(int use_type) {
		this.use_type = use_type;
	}
	
}
