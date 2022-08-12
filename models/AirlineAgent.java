package com.klef.ep.models;
import java.io.Serializable;


import javax.persistence.*;

@Entity
@Table(name="agent_table")
public class AirlineAgent implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	  @Id
	 @Column(name="agname")
	  private String aname;
	   @Column(name="agpwd")
	  private String awd;
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAwd() {
		return awd;
	}
	public void setAwd(String awd) {
		this.awd = awd;
	}
	
	
	

}
