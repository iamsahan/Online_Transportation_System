package com.Trip;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


@WebServlet("/TripDeleteServlet")
public class TripDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public TripDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		boolean isTrue = TripDButill.deleteTrip();
		
		
		if (isTrue == true) {
		
			out.println("<script type='text/javascript'>");
			out.println("alert('Trip Sucessfully Deleted')");
			out.println("location='SheduleATrip.jsp'");
			out.println("</script>");
		}
	
		else {
			RequestDispatcher dis = request.getRequestDispatcher("unsucess.jsp");
			dis.forward(request, response);
		
	}
	}

}
