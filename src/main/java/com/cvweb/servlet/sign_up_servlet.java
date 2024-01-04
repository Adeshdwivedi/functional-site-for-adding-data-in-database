package com.cvweb.servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import com.cvweb.dao.dao;
import com.cvweb.entities.user;
import com.cvweb.helper.isUnique;
import com.cvweb.helper.password_validation;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

public class sign_up_servlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

  try {

			String fname = request.getParameter("user_first_name");
			String lname = request.getParameter("user_last_name");
			String date = request.getParameter("user_dob");
			String email = request.getParameter("user_email");
			String phone = request.getParameter("user_phone");
			String password = request.getParameter("user_password");

			if (fname.equals("") || lname.equals("") || date.equals("") || email.equals("") || phone.equals("")
					|| password.equals("")) 
			{
				// out.println("you are not fill the all information");
				request.setAttribute("unsavedmsg","Sign Up  failed");
		        RequestDispatcher rd=request.getRequestDispatcher("sign_up.jsp");
		        rd.include(request, response);
		        
			}

			else if (phone.trim().length() == 10 && password.trim().length() >= 8
					&& password_validation.iscorrectpassword(password)==true) 
			{
				
				    isUnique uq = new isUnique();

				if (uq.check_email_phone(email, phone) == true)
				{
					dao d1 = new dao();
					user u = d1.signup(fname, lname, date, email, phone, password);

					if (u != null) 
					{
						HttpSession session = request.getSession();
						session.setAttribute("user_detail", u);
						response.sendRedirect("security_QnA.jsp");
					}

					else
					{
						out.print("unsaved");
				    }

			     }
              
              }
			
			else
			{
				out.print("something went wrong");
			}
	 }
    catch(Exception e)
	{
		e.printStackTrace();
	}
 }

}
