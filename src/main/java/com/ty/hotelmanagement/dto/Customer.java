package com.ty.hotelmanagement.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerid;
	private String customerName;
	private String customeremail;
	private long customerphone;
	private String customergender;
	private String customerpassword;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomeremail() {
		return customeremail;
	}
	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}
	public long getCustomerphone() {
		return customerphone;
	}
	public void setCustomerphone(long customerphone) {
		this.customerphone = customerphone;
	}
	public String getCustomergender() {
		return customergender;
	}
	public void setCustomergender(String customergender) {
		this.customergender = customergender;
	}
	public String getCustomerpassword() {
		return customerpassword;
	}
	public void setCustomerpassword(String customerpassword) {
		this.customerpassword = customerpassword;
	}
	
}
