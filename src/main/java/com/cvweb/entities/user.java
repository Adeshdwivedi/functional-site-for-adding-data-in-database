package com.cvweb.entities;

import java.sql.Date;

import javax.persistence.*;

import com.cvweb.entities.user_extra_info;

@Entity
@Table(name="User_info")
public class user 
{
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="user_id")
	 private int id;
	 @Column(name="first_name")
     private String fname;
	 @Column(name="last_name")
     private String lname;
	 @Column(name="Dob")
     private String  dob;
	 
	 @Column(name ="Email",unique =true)
     private String email;
	 
	 @Column(name="Phone_no", unique = true)
     private String phone;
	 
	 @Column(name="Password")
     private String password;
	
     

	public user(int id, String fname, String lname, String dob, String email, String phone, String password
			) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public user() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
     
}
