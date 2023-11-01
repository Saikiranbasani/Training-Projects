package com.npci.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.npci.Profile;

public class ProfileServiceImpl implements ProfileService {
	
    Scanner sc=new Scanner(System.in);
	
	Set<Profile> profiles=new HashSet<>();

	@Override
	public Profile saveProfile(Profile profile) {
		// TODO Auto-generated method stub
		profiles.add(profile);
		return profile;
	}

	@Override
	public String deleteProfile(String email_id) {
		// TODO Auto-generated method stub
		System.out.println(profiles);
		if(profiles.isEmpty()!=true) {
			Iterator <Profile> iterator=profiles.iterator();
			while(iterator.hasNext()) {
				Profile profile=iterator.next();
				if(profile.getEmailId()==email_id) {
					profiles.remove(profile);
				}
			}
			return "Profile deleted Successfully";
		}
		
		return "Profile_id not Found";
	}
	public String ShowAllProfiles() {
		if(profiles.isEmpty()!=true) {
			for(Profile p:profiles) {
				System.out.println(p);
			}
		}
		return "No Profile Created";
		
	}

	@Override
	public void login(String username, String password) {
		System.out.println(profiles);
		int count=0;
		for(Profile p:profiles) {
			if(p.getEmailId().equals(username)&&p.getPassword().equals(password)) {
				count=count+1;
			}
			else {
				count=count;
			}
			
		}
		if(count>0) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Login Unsuccessful");
		}
		
	}
	


}
