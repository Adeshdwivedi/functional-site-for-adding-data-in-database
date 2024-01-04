package com.cvweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.*;

import com.cvweb.dao.dao;
import com.cvweb.dao.securitydao;
import com.cvweb.entities.user;




public class security_servlet extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	     
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

         try {
			  
        	 String sport=request.getParameter("user_sports");
        	 String book=request.getParameter("user_book");
        	 int favnum=Integer.parseInt(request.getParameter("user_number"));
             
        	 HttpSession ses=request.getSession();
        	 user u1=(user)ses.getAttribute("user_dt");
        	 securitydao d1=new securitydao();
             boolean flag=d1.securityques(sport, book, favnum,u1);
        	 
        	 if(flag)
        	 {
        		ses.setAttribute("user_dtls", u1);
        		response.sendRedirect("signupprofile.jsp");
        	 }
        	 else
        	 {
				out.print("something went wrong");
			 }
        	 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
