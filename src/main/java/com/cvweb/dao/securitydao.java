package com.cvweb.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cvweb.entities.user;
import com.cvweb.entities.user_extra_info;
import com.cvweb.helper.connectionProvider;

public class securitydao
{
	  boolean flag=false;
	 public boolean  securityques(String sports,String book,int num, user u1)
	    {
	   	     SessionFactory factory=connectionProvider.getSessionFactory();
	         Session session=factory.openSession();
	       
	        user_extra_info uinfo= new user_extra_info();
	        uinfo.setBook(book);
	        uinfo.setSports(sports);
	        uinfo.setNum(num);
	        uinfo.setU1(u1);
	        
	        Transaction tx=session.beginTransaction();
	        session.save(uinfo);
	        
	        tx.commit();
	        session.close();
	        return flag=true;
	    }

}
