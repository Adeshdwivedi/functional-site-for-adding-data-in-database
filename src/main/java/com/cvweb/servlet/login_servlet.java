package com.cvweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.cvweb.dao.logindao;
import com.cvweb.entities.user;

public class login_servlet extends HttpServlet
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	   response.setContentType("text/html");
	   PrintWriter out= response.getWriter();
	   
	   try
	    {
		    String name=request.getParameter("user_email");
		    String email=request.getParameter("user_email");
		    String password=request.getParameter("user_password");
		    
		    logindao d1=new logindao();
		     
		    user u1=d1.login(name, email, password);
		    
		    if(u1!=null)
		    {
		    	 HttpSession ses=request.getSession();
		    	 ses.setAttribute("user_detail", u1);
		    	 response.sendRedirect("profile.jsp");
		    }
		    else 
		    {
		    	request.setAttribute("faillogin","Login failed");
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
						
			}
		    
		} 
	    catch (Exception e)
	    {
	    	e.printStackTrace();
	    	
	    	
	    }
	}

}
