package com.example.domain;

import java.util.Date;

public class CheckVO extends StaffVO{
	private int use_id;
	private int chk_code;
	private int chk_confirm;
	private String chk_type;
	private int chk_time;
	private Date chk_start;	
	private Date chk_end;
	private Date chk_day;
	private String employ_start;
	private String employ_end;
	private String start;
	private String end;
	private String day;
	
	
	
	@Override
	public String toString() {
		return "CheckVO [use_id=" + use_id + ", chk_code=" + chk_code + ", chk_confirm=" + chk_confirm + ", chk_type="
				+ chk_type + ", chk_time=" + chk_time + ", chk_start=" + chk_start + ", chk_end=" + chk_end
				+ ", chk_day=" + chk_day + ", employ_start=" + employ_start + ", employ_end=" + employ_end + ", start="
				+ start + ", end=" + end + ", day=" + day + "]";
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Date getChk_day() {
		return chk_day;
	}

	public void setChk_day(Date chk_day) {
		this.chk_day = chk_day;
	}
	
	public String getEmploy_start() {
		return employ_start;
	}



	public void setEmploy_start(String employ_start) {
		this.employ_start = employ_start;
	}



	public String getEmploy_end() {
		return employ_end;
	}



	public void setEmploy_end(String employ_end) {
		this.employ_end = employ_end;
	}



	public String getStart() {
		return start;
	}



	public void setStart(String start) {
		this.start = start;
	}



	public String getEnd() {
		return end;
	}



	public void setEnd(String end) {
		this.end = end;
	}


	public int getUse_id() {
		return use_id;
	}
	public void setUse_id(int use_id) {
		this.use_id = use_id;
	}
	public int getChk_code() {
		return chk_code;
	}
	public void setChk_code(int chk_code) {
		this.chk_code = chk_code;
	}
	public int getChk_confirm() {
		return chk_confirm;
	}
	public void setChk_confirm(int chk_confirm) {
		this.chk_confirm = chk_confirm;
	}
	public String getChk_type() {
		return chk_type;
	}
	public void setChk_type(String chk_type) {
		this.chk_type = chk_type;
	}
	public int getChk_time() {
		return chk_time;
	}
	public void setChk_time(int chk_time) {
		this.chk_time = chk_time;
	}
	public Date getChk_start() {
		return chk_start;
	}
	public void setChk_start(Date chk_start) {
		this.chk_start = chk_start;
	}
	public Date getChk_end() {
		return chk_end;
	}
	public void setChk_end(Date chk_end) {
		this.chk_end = chk_end;
	}
	
}
