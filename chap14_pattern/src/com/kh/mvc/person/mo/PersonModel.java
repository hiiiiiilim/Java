package com.kh.mvc.person.mo;

public class PersonModel {
	private String name;
	
	public void setPerson(String name) {
		this.name=name;
	}
	
	public String isVaildNumber() {
		if(name.equals(null)) {
			this.name=null;
		
		}	return name;
	}
}
