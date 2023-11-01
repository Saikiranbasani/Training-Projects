package com.npci.beans;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int contact_id;
	//foreign key
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="profile_id_ref")
	private int profile_id_ref;
	private int wallet_id_ref;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(int contact_id, int profile_id_ref, int wallet_id_ref) {
		super();
		this.contact_id = contact_id;
		this.profile_id_ref = profile_id_ref;
		this.wallet_id_ref = wallet_id_ref;
	}
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	public int getProfile_id_ref() {
		return profile_id_ref;
	}
	public void setProfile_id_ref(int profile_id_ref) {
		this.profile_id_ref = profile_id_ref;
	}
	public int getWallet_id_ref() {
		return wallet_id_ref;
	}
	public void setWallet_id_ref(int wallet_id_ref) {
		this.wallet_id_ref = wallet_id_ref;
	}
	

}
