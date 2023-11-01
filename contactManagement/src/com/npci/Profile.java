package com.npci;

import java.time.LocalDate;

public class Profile {
	private String emailId;
	private String name;
	private String password;
	private LocalDate dob;
	private long phone;
	
	
	public Profile(String emailId, String name, String password, LocalDate dob, long phone) {
		super();
		this.emailId = emailId;
		this.name = name;
		this.password = password;
		this.dob = dob;
		this.phone = phone;
	}
	


	@Override
	public String toString() {
		return "Profile [emailId=" + emailId + ", name=" + name + ", password=" + password + ", dob=" + dob
				+ ", phone=" + phone + "]";
	}



	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(int profileId) {
		this.emailId = emailId;
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


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	
	
     
}
