package com.cvweb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cvweb.entities.user;
import com.cvweb.helper.connectionProvider;

public class logindao 
{
	user u1=null;
	
    public user login(String phone,String email,String password)
    {
    	 SessionFactory factory=connectionProvider.getSessionFactory();
         Session session=factory.openSession();
         
         String query="from user";
          Query q=session.createQuery(query);
          
          List<user> list=q.list();
          
          for(user u: list)
          {
        	  if(u.getPhone().equals(phone) && u.getPassword().equals(password)||u.getEmail().equals(email) && u.getPassword().equals(password))
        	  {
        		  return u;	  
        	  }
          }
         
         
         
         return u1;
         
         
	
    }
}
