package com.cvweb.helper;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cvweb.entities.user;

public class isUnique 
{
    public static  boolean flag=true;  
	public boolean check_email_phone(String email,String phone)
	{
		SessionFactory factory=connectionProvider.getSessionFactory();
		Session session=connectionProvider.getSession(factory);
		
		String query=" from user";
		
		Query q=session.createQuery(query);
		
		List <user> list=q.list();
		
		for(user s:list)
		{
			if(s.getEmail().equals(email)&&s.getPhone().equals(phone))
			{
				 return flag=false;
				 
			}
			else if(s.getEmail().equals(email) && s.getPhone()!=phone)
			{
				return flag=false;
			}
			else if(s.getPhone().equals(phone) && s.getEmail()!=email)
			{
				return flag=false;
			}
		}
		
		return true;
	}
}
