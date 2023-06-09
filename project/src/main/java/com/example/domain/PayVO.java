package com.example.domain;

public class PayVO {
	private int use_id;
	private int pay_hour;
	private int pay_regular;
	
	@Override
	public String toString() {
		return "PayVO [use_id=" + use_id + ", pay_hour=" + pay_hour + ", pay_regular=" + pay_regular + "]";
	}
	public int getUse_id() {
		return use_id;
	}
	public void setUse_id(int use_id) {
		this.use_id = use_id;
	}
	public int getPay_hour() {
		return pay_hour;
	}
	public void setPay_hour(int pay_hour) {
		this.pay_hour = pay_hour;
	}
	public int getPay_regular() {
		return pay_regular;
	}
	public void setPay_regular(int pay_regular) {
		this.pay_regular = pay_regular;
	}
	
}
