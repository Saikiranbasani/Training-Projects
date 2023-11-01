package com.npci.dao;

import java.util.HashMap;
import java.util.Map;

public class GreetingsImpl implements Greetings{
	
	private static Map<String, String> map;
	
	public GreetingsImpl() {
		map=new HashMap<>();
		map.put("Telugu", "Namaskaram");
		map.put("Hindi", "Namaskar");
		map.put("Tamil", "Vanakkam");
		map.put("English", "Hello");
		map.put("Spanish", "Hola");
		
		
	}

	@Override
	public String greet(String name, String language) {
		// TODO Auto-generated method stub
		String lang=language;
		String value=map.get(lang);
		return value+","+name;
	}
	

}
