package com.klef.ep.models;
import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="flight_table")
public class Flight implements Serializable
{
	@Column(name="airlinename")
	private String airlinename;
	@Id
	@Column(name="fid")
	private String fid;
	@Column(name="fspoint")
	private String fspoint;
	@Column(name="fdpoint")
	private String fdpoint;
	@Column(name="fcapacity")
	private int fcapacity;
	public int getFcapacity() {
		return fcapacity;
	}
	public void setFcapacity(int fcapacity) {
		this.fcapacity = fcapacity;
	}
	@Column(name="fjdate")
	private String fjdate;
	private static final long serialVersionUID = 1L; 
	public String getAirlinename() {
		return airlinename;
	}
	public void setAirlinename(String airlinename) {
		this.airlinename = airlinename;
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getFspoint() {
		return fspoint;
	}
	public void setFspoint(String fspoint) {
		this.fspoint = fspoint;
	}
	public String getFdpoint() {
		return fdpoint;
	}
	public void setFdpoint(String fdpoint) {
		this.fdpoint = fdpoint;
	}
	public String getFjdate() {
		return fjdate;
	}
	public void setFjdate(String fjdate) {
		this.fjdate = fjdate;
	}


}
