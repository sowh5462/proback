package com.example.domain;

import java.util.Date;

public class StaffVO extends UserVO {
	private int use_id;
	private String sta_bank;
	private String sta_account;
	private int sta_type;
	private String sta_image;
	private Date sta_employ;
	private Date sta_end;
	private String sta_contract;
	private int sta_annual;
	
	
	
	@Override
	public String toString() {
		return "StaffVO [use_id=" + use_id + ", sta_bank=" + sta_bank + ", sta_account=" + sta_account + ", sta_type="
				+ sta_type + ", sta_image=" + sta_image + ", sta_employ=" + sta_employ + ", sta_end=" + sta_end
				+ ", sta_contract=" + sta_contract + ", sta_annual=" + sta_annual + "]";
	}
	public int getUse_id() {
		return use_id;
	}
	public void setUse_id(int use_id) {
		this.use_id = use_id;
	}
	public String getSta_bank() {
		return sta_bank;
	}
	public void setSta_bank(String sta_bank) {
		this.sta_bank = sta_bank;
	}
	public String getSta_account() {
		return sta_account;
	}
	public void setSta_account(String sta_account) {
		this.sta_account = sta_account;
	}
	public int getSta_type() {
		return sta_type;
	}
	public void setSta_type(int sta_type) {
		this.sta_type = sta_type;
	}
	public String getSta_image() {
		return sta_image;
	}
	public void setSta_image(String sta_image) {
		this.sta_image = sta_image;
	}
	public Date getSta_employ() {
		return sta_employ;
	}
	public void setSta_employ(Date sta_employ) {
		this.sta_employ = sta_employ;
	}
	public Date getSta_end() {
		return sta_end;
	}
	public void setSta_end(Date sta_end) {
		this.sta_end = sta_end;
	}
	public String getSta_contract() {
		return sta_contract;
	}
	public void setSta_contract(String sta_contract) {
		this.sta_contract = sta_contract;
	}
	public int getSta_annual() {
		return sta_annual;
	}
	public void setSta_annual(int sta_annual) {
		this.sta_annual = sta_annual;
	}
	
}
