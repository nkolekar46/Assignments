package com.demo.httpAss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyLoginServlet
 */
@WebServlet("/MyLoginServlet")
public class MyLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MyLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user= request.getParameter("txtusername");
		String pass = request.getParameter("txtpassword");
		if(user.equals("admin") && pass.equals("admin"))
		{
			
			RequestDispatcher rd=request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);
		}
		else
			out.println("Invalid username and password");
	}

}
