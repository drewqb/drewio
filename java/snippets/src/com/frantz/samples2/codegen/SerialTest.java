package com.frantz.samples2.codegen;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SerialTest  implements Serializable {
		 
	//  private static final long serialVersionUID = -6470090944414208496L;
	     
	    private String name;
	    private int id;
	    transient private int salary;
	//  private String password;
	    Pointer myBar = new Pointer();
	    Map<String, String> m_Map = new HashMap<String, String>();
	    
	    @Override
	    public String toString(){
	        return "Employee{name="+name+",id="+id+",salary="+salary+"}";
	    }
	     
	    //getter and setter methods
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	        myBar.pointer="Hello";
	        myBar.m_Parent=this;
	        m_Map.put("a", "b");
	    }
	 
	    public int getId() {
	        return id;
	    }
	 
	    public void setId(int id) {
	        this.id = id;
	    }
	 
	    public int getSalary() {
	        return salary;
	    }
	 
	    public void setSalary(int salary) {
	        this.salary = salary;
	    }
	 
	//  public String getPassword() {
//	      return password;
	//  }
	//
	//  public void setPassword(String password) {
//	      this.password = password;
	//  }
	     
	}