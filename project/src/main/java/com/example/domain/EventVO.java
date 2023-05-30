package com.example.domain;

import java.util.Date;

public class EventVO {
	private int use_id;
	private int event_id;
	private int use_work_num;
	private String event_name;
	private Date event_start;
	private Date event_end;
	
	
	@Override
	public String toString() {
		return "EventVO [use_id=" + use_id + ", event_id=" + event_id + ", use_work_num=" + use_work_num
				+ ", event_name=" + event_name + ", event_start=" + event_start + ", event_end=" + event_end + "]";
	}
	public int getUse_id() {
		return use_id;
	}
	public void setUse_id(int use_id) {
		this.use_id = use_id;
	}
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public int getUse_work_num() {
		return use_work_num;
	}
	public void setUse_work_num(int use_work_num) {
		this.use_work_num = use_work_num;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public Date getEvent_start() {
		return event_start;
	}
	public void setEvent_start(Date event_start) {
		this.event_start = event_start;
	}
	public Date getEvent_end() {
		return event_end;
	}
	public void setEvent_end(Date event_end) {
		this.event_end = event_end;
	}
	
}
