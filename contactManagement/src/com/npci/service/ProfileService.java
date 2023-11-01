package com.npci.service;


import com.npci.Profile;

public interface ProfileService {
	
	Profile saveProfile(Profile p);
	
	String deleteProfile(String email_id);
	void login(String username,String password);

}
