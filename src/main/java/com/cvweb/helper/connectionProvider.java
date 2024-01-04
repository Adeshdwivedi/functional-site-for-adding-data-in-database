package com.cvweb.helper;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class connectionProvider
{
	public static SessionFactory  factory=null;
	public static Session session=null;
	public static SessionFactory getSessionFactory()
	{
		if(factory==null)
		{
			factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            return factory;    
		}
     
		return factory;
	}
	
	public static Session getSession(SessionFactory fact)
	{
		
		  if(fact!=null)
		  {
			   session=fact.openSession();
			   return session;
		  }
		  
		  return session;
	}

}
