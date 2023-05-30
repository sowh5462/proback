package com.example.domain;

import java.util.Date;

public class TimeVO {
	private int use_id;
	private Date time_start;
	private Date time_end;
	
	@Override
	public String toString() {
		return "TimeVO [use_id=" + use_id + ", time_start=" + time_start + ", time_end=" + time_end + "]";
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
	
}
