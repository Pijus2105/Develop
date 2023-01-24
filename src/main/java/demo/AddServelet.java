package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServelet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("firstnum"));
		int j = Integer.parseInt(req.getParameter("secondnum"));
		
		int Add = i+j;
		
		HttpSession session = req.getSession();
		session.setAttribute("Add", Add);
		
		res.sendRedirect("url");
		
		//res.sendRedirect("url?parameter="+Add);
		
//		req.setAttribute("k", k);
//	    jakarta.servlet.RequestDispatcher rq = req.getRequestDispatcher("sq");
//		rq.forward(req, res);
		
		
	}

}
