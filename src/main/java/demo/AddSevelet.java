package demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddSevelet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int i = Integer.parseInt(req.getParameter("firstnum"));
		int j = Integer.parseInt(req.getParameter("secondnum"));
		
		int k = i+j;
		
		PrintWriter out = res.getWriter();
		out.println("The result is : - " + k);
		
	}

}
