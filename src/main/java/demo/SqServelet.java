package demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServelet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		HttpSession session = req.getSession();
		
		int p = (int) session.getAttribute("Add");
		//int k = (int) req.getAttribute("k");
		
		//int p = Integer.parseInt(req.getParameter("parameter"));
		
		int multiplyResult = p * p;
		
		PrintWriter out = res.getWriter();
		
		out.println("The result is : - " + multiplyResult);
		
		
		
		
	}
	

}
