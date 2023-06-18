package com.example.domain;

import java.util.Date;

public class TimeVO extends StaffVO{
	private int time_code;
	private int use_id;
	private Date time_start;
	private Date time_end;
	private String start;
	private String end;
	public int getTime_code() {
		return time_code;
	}
	public void setTime_code(int time_code) {
		this.time_code = time_code;
	}
	public int getUse_id() {
		return use_id;
	}
	public void setUse_id(int use_id) {
		this.use_id = use_id;
	}
	public Date getTime_start() {
		return time_start;
	}
	public void setTime_start(Date time_start) {
		this.time_start = time_start;
	}
	public Date getTime_end() {
		return time_end;
	}
	public void setTime_end(Date time_end) {
		this.time_end = time_end;
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
	
	
	
}
