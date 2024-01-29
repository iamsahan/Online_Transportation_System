package com.Customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CustomerDeleteServlet")
public class CustomerDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public CustomerDeleteServlet() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean isTrue = CustomerDButill.deleteCustomer();
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
			if (isTrue == true) {
			
				out.println("<script type='text/javascript'>");
				out.println("alert('Account Sucessfully Deleted')");
				out.println("location='CustomerSignUp.jsp'");
				out.println("</script>");
			}
		
			else {
				RequestDispatcher dis = request.getRequestDispatcher("unsucess.jsp");
				dis.forward(request, response);
			
		}
		
	}

}
