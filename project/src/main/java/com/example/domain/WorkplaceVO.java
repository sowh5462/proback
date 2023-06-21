package com.example.domain;

public class WorkplaceVO {
	private int use_id;
	private int use_work_num;
	private int use_work_num2;
	private String work_address;
	private String work_name;
	
	public int getUse_work_num2() {
		return use_work_num2;
	}
	public void setUse_work_num2(int use_work_num2) {
		this.use_work_num2 = use_work_num2;
	}
	
	
	@Override
	public String toString() {
		return "WorkplaceVO [use_id=" + use_id + ", use_work_num=" + use_work_num + ", work_address=" + work_address
				+ ", work_name=" + work_name + "]";
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
	public String getWork_address() {
		return work_address;
	}
	public void setWork_address(String work_address) {
		this.work_address = work_address;
	}
	public String getWork_name() {
		return work_name;
	}
	public void setWork_name(String work_name) {
		this.work_name = work_name;
	}
	
}
