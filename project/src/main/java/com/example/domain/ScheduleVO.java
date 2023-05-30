package com.example.domain;

import java.util.Date;

public class ScheduleVO {
	private int sche_id;
	private int use_id;
	private int sche_day;
	private Date sche_start;
	private Date sche_end;
	
	@Override
	public String toString() {
		return "ScheduleVO [sche_id=" + sche_id + ", use_id=" + use_id + ", sche_day=" + sche_day + ", sche_start="
				+ sche_start + ", sche_end=" + sche_end + "]";
	}
	public int getSche_id() {
		return sche_id;
	}
	public void setSche_id(int sche_id) {
		this.sche_id = sche_id;
	}
	public int getUse_id() {
		return use_id;
	}
	public void setUse_id(int use_id) {
		this.use_id = use_id;
	}
	public int getSche_day() {
		return sche_day;
	}
	public void setSche_day(int sche_day) {
		this.sche_day = sche_day;
	}
	public Date getSche_start() {
		return sche_start;
	}
	public void setSche_start(Date sche_start) {
		this.sche_start = sche_start;
	}
	public Date getSche_end() {
		return sche_end;
	}
	public void setSche_end(Date sche_end) {
		this.sche_end = sche_end;
	}
	
}
