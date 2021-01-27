package com.demo.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("LoginHttpSession")
public class LoginServletHttp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public LoginServletHttp() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("textusername");
		String pass = request.getParameter("textpassword");
		if (user.equals("admin") && pass.equals("admin")) {
			HttpSession session = request.getSession(); 
			session.setAttribute("sessionkey", "1234"); 
			response.sendRedirect("httpsessionServlet");

		} else {
			out.println("Invalid username/password.....");
		}
	}
}
