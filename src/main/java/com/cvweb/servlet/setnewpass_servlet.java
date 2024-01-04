package com.cvweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.cvweb.dao.setnewpassdao;
import com.cvweb.entities.user;
import com.cvweb.helper.password_validation;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class setnewpass_servlet extends HttpServlet
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		  response.setContentType("text/html");
		  PrintWriter out=response.getWriter();
         try
         {
		       String phone=request.getParameter("user_phone");
		       String password=request.getParameter("user_new_password");
		       
		    if(password_validation.iscorrectpassword(password)==true && password!="" && phone.trim().length()==10)
		    {
		    	   
		    
		       HttpSession ses=request.getSession();
		       user u1=(user)ses.getAttribute("user_ids2");
		       int id=u1.getId();
		      
		       setnewpassdao d1=new setnewpassdao();
		       int flag=d1.setnewpass(phone, password, id);
		       if(flag>=1 && flag<=1000000000000000000l)
		       {
		    	   response.sendRedirect("login.jsp");
		       }
		       else 
		       {
		    	   request.setAttribute("msg4","Password Not Updated!");
		           RequestDispatcher rd=request.getRequestDispatcher("setnewpass.jsp");
		           rd.include(request, response);
			   }
		       
		       
		    }
		    else 
		    {
		     
		    	if(password_validation.iscorrectpassword(password)==false&&password.length()>=8)
		    	{
		    		request.setAttribute("msg","Password is weak pls! include Uppercase,Lowercase and Number");
		    	}
		    	else if(password.length()<=8)
		    	{
		    		request.setAttribute("msg1","Password must contain 8 character");
		    	}
		    	
		    	 if(phone.trim().length()<10||phone.trim().length()>10)
			    {
			    	request.setAttribute("msg2","Phone no. is not valid");
			    }			    
		    	
		       if(phone.trim().length()==10 ||password_validation.iscorrectpassword(password)==false&&password.length()>=8||password_validation.iscorrectpassword(password)==false&&password.length()<=8||phone.trim().length()<10||phone.trim().length()>10)
		       {
		    	 RequestDispatcher rd=request.getRequestDispatcher("setnewpass.jsp");
			     rd.include(request, response);
		       }
		     
		    	
			}
		       
		 }
         catch (Exception e) 
         {
              e.printStackTrace();
		 }
	}

}
