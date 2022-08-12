package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="ticket_table")
public class Ticket implements Serializable    
{

 
	private static final long serialVersionUID = 1L;    
	@Column(name="pbname")
	private String pbname;
	@Id
	@Column(name="pbmob")
	private String pbmob;
	
	@Column(name="pbgender")
	private String pbgender;
	
	@Column(name="pbemail")
	private String pbemail;
	
	@Column(name="pbdpoint")
	private String pbdpoint;
	
	@Column(name="pdpoint")
	private String pdpoint;
	
	@Column(name="pbuname")
	private String pbuname;
	@Column(name="pbage")
	private int pbage;
	
	@Column(name="pbdate")
	private String pbdate;
	
	public String getPbuname() {
		return pbuname;
	}
	public void setPbuname(String pbuname) {
		this.pbuname = pbuname;
	}
	public String getPbdpoint() {
		return pbdpoint;
	}
	public void setPbdpoint(String pbdpoint) {
		this.pbdpoint = pbdpoint;
	}

	
	public String getPdpoint() {
		return pdpoint;
	}
	public void setPdpoint(String pdpoint) {
		this.pdpoint = pdpoint;
	}

	
	
	public String getPbname() {
		return pbname;
	}
	public void setPbname(String pbname) {
		this.pbname = pbname;
	}
	public String getPbmob() {
		return pbmob;
	}
	public void setPbmob(String pbmob) {
		this.pbmob = pbmob;
	}
	public String getPbgender() {
		return pbgender;
	}
	public void setPbgender(String pbgender) {
		this.pbgender = pbgender;
	}
	public String getPbemail() {
		return pbemail;
	}
	public void setPbemail(String pbemail) {
		this.pbemail = pbemail;
	}
	public String getBoardingpoint() {
		return pbdpoint;
	}
	
	
	public int getPbage() {
		return pbage;
	}
	public void setPbage(int pbage) {
		this.pbage = pbage;
	}
	public String getPbdate() {
		return pbdate;
	}
	public void setPbdate(String pbdate) {
		this.pbdate = pbdate;
	}  
}
