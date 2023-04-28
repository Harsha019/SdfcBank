package com.harsha.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SDFC")
public class Bank_det {
@Id
	private String ac;
	private String name;
	private String password;
	private String cpassword;
	private double amount;
	private String address;
	private String tranac;
	public Bank_det() {
		super();
	}
	public Bank_det(String ac, String name, String password, String cpassword, double amount, String address,
			String tranac) {
		super();
		this.ac = ac;
		this.name = name;
		this.password = password;
		this.cpassword = cpassword;
		this.amount = amount;
		this.address = address;
		this.tranac = tranac;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTranac() {
		return tranac;
	}
	public void setTranac(String tranac) {
		this.tranac = tranac;
	}
	@Override
	public String toString() {
		return "Bank_det [ac=" + ac + ", name=" + name + ", password=" + password + ", cpassword=" + cpassword
				+ ", amount=" + amount + ", address=" + address + ", tranac=" + tranac + "]";
	}
	
	
	
}
