package com.Customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CustometInsert")
public class CustometInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String pw = request.getParameter("pw");
		
		
		boolean isTrue;
		boolean isExist;
		
		isExist = CustomerDButill.validateEmail(email);
		isTrue = CustomerDButill.insertCustomer(fname, lname, email, phone, pw);
		
		if (isTrue == true && isExist == false) {
			RequestDispatcher dis = request.getRequestDispatcher("CustomerLogin.jsp");
			dis.forward(request, response);
		}
		
		else if (isTrue == true && isExist == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Email Address Already Registered In the System')");
			out.println("location='CustomerSignUp.jsp'");
			out.println("</script>");
		}
		
		else {
			RequestDispatcher undis = request.getRequestDispatcher("unsucess.jsp");
			undis.forward(request, response);
		}
		
		
	}

}
