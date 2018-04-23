package com.java.base.serializable;

import java.io.Serializable;

public class A extends B implements Serializable { 
 
    private static final long serialVersionUID = 2L; 
    
    private String name; 
    
    public String getName() 
    { 
        return name; 
    } 
    
    public void setName(String name) 
    { 
        this.name = name; 
    }

	public A() {
		super();
	}
    
    
}