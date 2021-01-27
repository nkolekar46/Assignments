package com.demo.ass;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import net.javaguides.login.bean.LoginBean;
//import net.javaguides.login.database.LoginDao;

/**
 * Servlet implementation class loginSevlet
 */
@WebServlet("/loginSevlet")
public class loginSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        loginFormClass loginBean = new loginFormClass();
	        loginBean.setUsername(username);
	        loginBean.setPassword(password);

	        try {
	            if (loginClass.validate(loginBean)) {
	                //HttpSession session = request.getSession();
	                // session.setAttribute("username",username);
	                response.sendRedirect("loginSuccess.html");
	            } else {
	                HttpSession session = request.getSession();
	                //session.setAttribute("user", username);
	                response.sendRedirect("loginForm.html");
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }

}
