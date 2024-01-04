package com.cvweb.helper;

public class password_validation
{
     public static boolean flag=false;
     
     public static boolean iscorrectpassword(String password)
     {
    	  boolean hasnum=false;
    	  boolean hascap=false;
    	  boolean hassmall=false;
    	  char c;
    	  
    	  for(int i=0; i<password.length();i++)
    	  {
    		  c=password.charAt(i);
    		  
    		  if(Character.isDigit(c))
    		  {
    			  hasnum=true;
    		  }
    		  else if(Character.isUpperCase(c))
    		  {
    			  hascap=true;
    		  }
    		  else if(Character.isLowerCase(c))
    		  {
    			  hassmall=true;
    		  }
              	  	 
    	  }
    	  
    	  if(hasnum && hascap && hassmall)
		  {
			  return flag=true;
		  }
    	  else
    	  {
			 return flag=false;
		  }
    	  
    	  
     }
}
