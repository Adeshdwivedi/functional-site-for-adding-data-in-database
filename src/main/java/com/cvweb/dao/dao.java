package com.cvweb.dao;

import java.sql.Date;
import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.*;

import com.cvweb.entities.*;
import com.cvweb.helper.*;

import net.bytebuddy.implementation.attribute.AnnotationAppender.Target.OnType;

public class dao
{
	private user u1=null;
	public user signup(String fname, String lname, String dob, String email, String phone, String password)
	{
		SessionFactory factory = connectionProvider.getSessionFactory();
		Session session = factory.openSession();
	    u1 = new user();
		u1.setFname(fname);
		u1.setLname(lname);
		u1.setDob(dob);
		u1.setEmail(email);
		u1.setPhone(phone);
		u1.setPassword(password);
		Transaction tx = session.beginTransaction();
		session.save(u1);
		tx.commit(); 
		session.close();
		return u1;
		
	}
	
	
	
	
       
	  
}
