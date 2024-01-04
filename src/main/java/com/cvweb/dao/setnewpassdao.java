package com.cvweb.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cvweb.helper.connectionProvider;

public class setnewpassdao 
{
   int flag=0;
   public int setnewpass(String phone,String password,int id)
   {
	   SessionFactory factory=connectionProvider.getSessionFactory();
	   Session session=connectionProvider.getSession(factory);
	   
	   Transaction tx=session.beginTransaction();
	   String query=" update user set password=:x where id=:y and phone=:z";
	    
	   Query q=session.createQuery(query);
	   q.setParameter("x", password);
	   q.setParameter("y", id);
	   q.setParameter("z", phone);
	   flag=q.executeUpdate();
	   tx.commit();
	   session.close();
       return flag;
	      
   }
   
}
