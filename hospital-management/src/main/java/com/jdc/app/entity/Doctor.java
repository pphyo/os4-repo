package com.jdc.app.entity;

import javax.persistence.Entity;

@Entity
public class Doctor extends Staff {

	private static final long serialVersionUID = 1L;
	private String type;
	
	public Doctor() {}
	
	public Doctor(String type) {
		
		Role roleType = Role.valueOf(type);
		
		if(Role.Doctor.equals(roleType))
			setRole(Role.Doctor);
		else if(roleType.equals(Role.Head_Doctor))
			setRole(Role.Head_Doctor);
		else if(roleType.equals(Role.Assitance_Doctor))
			setRole(Role.Assitance_Doctor);
		
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
