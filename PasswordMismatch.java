package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PasswordMismatch extends HttpServlet {
	
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
	
		String str1=request.getParameter("p1");
		String str=request.getParameter("p2");
		if(str1!=str)
		{
			out.println("Passwords not matching ...");
		}
		else
		{
			out.println("same passwords..."+str1);
		}
	
	
}
}
