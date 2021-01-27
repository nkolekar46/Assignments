package com.demo.emp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmoInfo")
public class EmoInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public EmoInfoServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("txtid"));
		String name=request.getParameter("txtname");
		MyDatabaseOperations db=new MyDatabaseOperations();
		db.insertEmp(id, name);
		out.println(db.displayEmp());
	}

}
