package com.cvweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.http.HttpSession;



public class logout_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
        
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	
        try {
			 
        	HttpSession session=request.getSession();
            session.removeAttribute("user_login");
            session.invalidate();
            response.sendRedirect("login.jsp");
            
		} catch (Exception e) {
			e.printStackTrace();
		}		
		

	}

}
