package com.npci.beans;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="profile")
public class Profile {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int profileId;
	private String name;
	private String emailId;
	private String password;
	private LocalDate dob;
	private long phone;
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="wallet_id_ref")
	private int wallet_id_ref;
	 
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profile(int profileId, String name, String emailId, String password, LocalDate dob, long phone,
			int wallet_id_ref) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.dob = dob;
		this.phone = phone;
		this.wallet_id_ref = wallet_id_ref;
	}
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
	public int getWallet_id_ref() {
		return wallet_id_ref;
	}
	public void setWallet_id_ref(int wallet_id_ref) {
		this.wallet_id_ref = wallet_id_ref;
	}
	
	

}
