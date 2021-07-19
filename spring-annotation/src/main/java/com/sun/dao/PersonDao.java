package com.sun.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {
	
    private String label = "1";

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void print(){
		System.out.println(label);
	}

	@Override
	public String toString() {
		return "PersonDao [label=" + label + "]";
	}
    
    
    
	
	

}
