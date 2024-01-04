package com.cvweb.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cvweb.entities.user_extra_info;

import com.cvweb.helper.connectionProvider;

import net.bytebuddy.asm.Advice.Return;

public class forgatedao
{  
	    user_extra_info us1=null;
        public user_extra_info forgatepass(String sports,String book,int num)
        {
        	if(us1==null)
        	{
        	SessionFactory factory=connectionProvider.getSessionFactory();
        	Session session=connectionProvider.getSession(factory);
        	String query=" from user_extra_info where  sports=:x and book=: y";
        	Query q=session.createQuery(query);
        	q.setParameter("x", sports);
        	q.setParameter("y", book);
        	us1=(user_extra_info)q.uniqueResult();
        	return us1;	 
        	}
        	else {
				return null;
			}
        
        }
       
}
