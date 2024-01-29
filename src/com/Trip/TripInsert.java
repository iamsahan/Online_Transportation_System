package com.Trip;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/TripInsert")
public class TripInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				String pick = request.getParameter("pick");
				String drop = request.getParameter("drop");
				String type = request.getParameter("type");
				
				
				
				boolean isTrue;
				
				HttpSession session = request.getSession();
				String uname = (String) session.getAttribute("uemail");
				
				isTrue = TripDButill.insertTripDetails(uname, pick, drop, type);
				
				if (isTrue == true) {
					List<Trip> tripDetails = TripDButill.getTripDetails();
					request.setAttribute("tripDetails", tripDetails);
					
					RequestDispatcher dis = request.getRequestDispatcher("TripSummery.jsp");
					dis.forward(request, response);
				}
				
				else {
					RequestDispatcher undis = request.getRequestDispatcher("unsucess.jsp");
					undis.forward(request, response);
				}
	}

}
