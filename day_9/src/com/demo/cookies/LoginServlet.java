package com.demo.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user= request.getParameter("textusername");
		String pass = request.getParameter("textpassword");
		if(user.equals("admin") && pass.equals("admin"))
		{
			Cookie ck = new Cookie("sessionid", "123456");
			response.addCookie(ck);
			RequestDispatcher rd=request.getRequestDispatcher("ProfileServlet");
			rd.forward(request, response);
		}
		else
			out.println("Invalid username and password");
		}

}
