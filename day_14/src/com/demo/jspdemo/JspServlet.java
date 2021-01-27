package com.demo.jspdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JspServlet")
public class JspServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public JspServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		if(user.equals("admin") && pass.equals("admin"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("MyJspFilejsp.jsp");
			request.setAttribute("message", "<p class='btn-success'> SUCCESSFUL LOGIN </p>");
			rd.forward(request, response);
		}
		else
		{

			RequestDispatcher rd = request.getRequestDispatcher("MyJspFilejsp.jsp");
			request.setAttribute("message", "<p class='btn-danger'> INVALID LOGIN </p>");
			rd.forward(request, response);
		}	
	
	
	}

}
