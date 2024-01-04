package filters_for_validation;

import com.cvweb.helper.isUnique;
import com.cvweb.helper.password_validation;
import com.google.protobuf.Message;

import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import org.hibernate.Session;

import jakarta.servlet.http.*;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter(filterName ="signup_filter", urlPatterns ="/sign_up_servlet")
public class signup_filter extends HttpFilter implements Filter {
       
   
    public signup_filter() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		try
		{
			
			String fn=request.getParameter("user_first_name");
			String ln=request.getParameter("user_last_name");
			String dob=request.getParameter("user_dob");
			String email=request.getParameter("user_email");
			String phone=request.getParameter("user_phone");
			String password=request.getParameter("user_password");
         
		    isUnique uq = new isUnique();

			
			if(fn.equals(""))
			{
				String msg=" First name field can not be empty";
                request.setAttribute("msg", msg);
                
			}
		    if(ln.equals(""))
			{
				String msg1=" Last name can not be empty";
				request.setAttribute("msg1", msg1);
			}
			if(dob.equals(""))
			{
				String msg2="Dob can not be empty";
				request.setAttribute("msg2", msg2);
			}
			
			if(email.equals(""))
			{
				String msg3="email field can not be empty";
				request.setAttribute("msg3", msg3);
			}
			 if(phone.trim().length()<10||phone.trim().length()>10)
			{
				if(phone.trim().length()!=10)
				{
					if(phone.equals(""))
					{
						String msg4="phone no. field can not be empty";
					    request.setAttribute("msg4", msg4);
					}
					else 
					{
					 String msg9="phone no. is not valid";
					 request.setAttribute("msg9", msg9);
					}
					
				}
			}
			 
			 if(password.length()<=8 && password_validation.iscorrectpassword(password)==false||password.length()>=8 && password_validation.iscorrectpassword(password)==false)
			{
				if(password.equals(""))
				{
					String msg5="password field can not be empty";
				    request.setAttribute("msg5", msg5);
				}
		
				else
				{
					if(password_validation.iscorrectpassword(password)==false && password.length()>=8)
					{
					     String msg7= "password is weak pls! include uppercase lowercase and number";
					     request.setAttribute("msg7", msg7);
					     
					}
					if(password.length()<8)
					{
						String msg6="password must contain 8 letters";
						request.setAttribute("msg6", msg6);
					}
				}
				
			}
		
			if(uq.check_email_phone(email, phone) ==false)
			{
				String msg8em="Email should be unique";
				String msg8ph="Phone should be unique";
				request.setAttribute("msg8em", msg8em);
				request.setAttribute("msg8ph", msg8ph);

			}
			 
		if(fn.equals("")||ln.equals("")||dob.equals("") &&dob.equals(null)||email.equals("")||phone.equals("")||password.equals(""))
		{
			RequestDispatcher rd=request.getRequestDispatcher("sign_up.jsp");
			rd.include(request, response);
		}
		else if (password.length()<=8 && password_validation.iscorrectpassword(password)==false||password.length()>=8 && password_validation.iscorrectpassword(password)==false||phone.trim().length()<10||phone.trim().length()>10||phone.trim().length()!=10||uq.check_email_phone(email, phone) ==false) 
		{
			RequestDispatcher rd=request.getRequestDispatcher("sign_up.jsp");
			rd.include(request, response);

		} 
		
			 
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		chain.doFilter(request, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
