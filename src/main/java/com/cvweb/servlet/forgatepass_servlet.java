package com.cvweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.cvweb.dao.forgatedao;
import com.cvweb.entities.user;
import com.cvweb.entities.user_extra_info;
import com.cvweb.helper.password_validation;

import jakarta.servlet.http.HttpSession;


public class forgatepass_servlet extends HttpServlet
{
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try
		{
			String  sports= request.getParameter("user_sports");
			String  book=request.getParameter("user_book");
			String  num=request.getParameter("user_number");
			forgatedao d1=new forgatedao();
	    
	   user_extra_info us1=(user_extra_info)d1.forgatepass(sports, book, 0);
	   if(us1!=null)
	   {
		  user u1 =us1.getU1();
		  HttpSession ses=(HttpSession) request.getSession();
		  ses.setAttribute("user_ids",u1);
		  response.sendRedirect("setnewpass.jsp");
		  
	   }
	   else
	   {
		   request.setAttribute("forgate_msg","Entered Information is Mismatch can not forgate password");
		   RequestDispatcher rd=request.getRequestDispatcher("forgate_pass.jsp");
		   rd.include(request, response);
	   }
	
	 
			
			
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
