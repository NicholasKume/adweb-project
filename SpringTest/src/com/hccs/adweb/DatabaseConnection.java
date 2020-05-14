package com.hccs.adweb;

public class DatabaseConnection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String fname;
	private String lname;
	private String DOB;
	
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public DatabaseConnection() {
		
	}

	public DatabaseConnection(String i, String f,String l, String d) {
		id = i;
		fname = f;
		lname = l;
		DOB = d;
	}
}