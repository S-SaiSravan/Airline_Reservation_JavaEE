package com.klef.ep.models;

import java.io.Serializable;


import javax.persistence.*;

@Entity
@Table(name="passenger_table")
public class Passenger implements Serializable    
{

 
	private static final long serialVersionUID = 1L;    
	
	   @Id
	   @Column(name="pname") 
	  private String pname;
	   @Column(name="gender")
	  private String gender;
	   @Column(name="age")
	  private String age;
	   @Column(name="email")
	  private String email;
	   @Column(name="puname")
	  private String puname;
	   @Column(name="pwd")
	  private String pwd;
	   @Column(name="mob")
	  private String mob;
	  
	  
    public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPuname() {
		return puname;
	}
	public void setPuname(String puname) {
		this.puname = puname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}

  

  
  
}
