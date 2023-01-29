package demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/url")
public class SqServelet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
	  int p=0;
		
		
	   Cookie cookies[] = 	req.getCookies();
		
	   for(Cookie c : cookies) {
		   
		   if (c.getName().equals("p"))
			   p = Integer.parseInt(c.getValue());
	   }
		
		//2. //HttpSession session = req.getSession();
		
		//int p = (int) session.getAttribute("Add");
		//1. //int k = (int) req.getAttribute("k");
		
		//int p = Integer.parseInt(req.getParameter("parameter"));
		
		int multiplyResult = p * p;
		
		PrintWriter out = res.getWriter();
		
		out.println("The result is : - " + multiplyResult);
		
		
		
		
		
		
	}
	

}
