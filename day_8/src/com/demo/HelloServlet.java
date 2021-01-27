package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// project for website visit counter using servlet

@WebServlet("/HelloServlet")  	
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       int count;
 
    public HelloServlet() {
        super();
    }
    
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	System.out.println("Init method....");
    	count=0;
    	//System.out.println("count="+count);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	count++;
	PrintWriter out = response.getWriter();
	//out.println("You are visitor number:"+count);
	out.println("You are in Get Meyhod");
	String user = request.getParameter("textusername");
	String pass = request.getParameter("textpassword");
		out.println(user+" "+pass);
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.getWriter().println("Dopost Method");
	PrintWriter out = response.getWriter();
	out.println("You are in Post Meyhod");
	String user = request.getParameter("textusername");
	String pass = request.getParameter("textpassword");
		out.println(user+" "+pass);
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("Destroy Method");
	}

}
