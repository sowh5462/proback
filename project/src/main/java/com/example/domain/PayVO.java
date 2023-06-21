package com.example.domain;

public class PayVO {
	private int use_id;
	private int pay_hour;
	private String pay_name;
	private int pay_regular;
	
	public int getUse_id() {
		return use_id;
	}
	public void setUse_id(int use_id) {
		this.use_id = use_id;
	}
	public int getPay_regular() {
		return pay_regular;
	}
	public void setPay_regular(int pay_regular) {
		this.pay_regular = pay_regular;
	}
	public String getPay_name() {
		return pay_name;
	}
	public void setPay_name(String pay_name) {
		this.pay_name = pay_name;
	}
	public int getPay_hour() {
		return pay_hour;
	}
	public void setPay_hour(int pay_hour) {
		this.pay_hour = pay_hour;
	}
	
}
