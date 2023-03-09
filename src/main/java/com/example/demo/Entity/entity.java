package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Spark")
public class entity {
	@Id
	private int eid;
	private String fname;
	private String lname;
	private String pname;
	private String sname;
	private long cno;
	private String gender;
	private String email;
	private String city;
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public long getCno() {
		return cno;
	}

	public void setCno(long cno) {
		this.cno = cno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public entity(int eid, String fname, String lname, String pname, String sname, long cno, String gender,
			String email, String city) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.lname = lname;
		this.pname = pname;
		this.sname = sname;
		this.cno = cno;
		this.gender = gender;
		this.email = email;
		this.city = city;
	}

	public entity() {
	}
}
