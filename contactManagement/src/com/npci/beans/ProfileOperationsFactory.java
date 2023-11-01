package com.npci.beans;

import com.npci.service.ProfileService;
import com.npci.service.ProfileServiceImpl;

public class ProfileOperationsFactory {
	public static ProfileService getInstance() {
		ProfileService Operations=new ProfileServiceImpl();
		return Operations;
		
	}

}
