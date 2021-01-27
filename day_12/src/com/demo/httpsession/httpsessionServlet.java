package com.demo.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class httpsessionServlet
 */
@WebServlet("/httpsessionServlet")
public class httpsessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public httpsessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		if(session != null)
		{
			out.println("Welcome to your profile");
			out.println(session.getId());	
			session.invalidate();
		}
		else
		{
				out.println("Login again");
		}
	}

}
