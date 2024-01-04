package com.cvweb.entities;

import com.cvweb.entities.user;

import javax.persistence.*;
import javax.persistence.*;

@Entity
@Table(name ="user_security_question")
public class user_extra_info 
{ 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="Q1_fav_sports")
    private String sports;
	@Column(name="Q2_fav_book")
    private String book;
	@Column(name="Q3_fav_number")
    private int  num;
    
	@OneToOne
	private user u1;

	

	public user_extra_info(String sports, String book, int num) {
		super();
		this.sports = sports;
		this.book = book;
		this.num = num;
	}

	public user_extra_info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSports() {
		return sports;
	}

	public void setSports(String sports) {
		this.sports = sports;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
   
	public user getU1() {
		return u1;
	}

	public void setU1(user u1) {
		this.u1 = u1;
	}

    
}
