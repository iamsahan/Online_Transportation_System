package com.Trip;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TripUpdateServlet")
public class TripUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TripUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pick = request.getParameter("pick");
		String drop = request.getParameter("drop");
		String vtype = request.getParameter("vtype");
		
		boolean isTrue = TripDButill.updateTrip(pick, drop, vtype);
		
		if (isTrue == true) {
			
			List<Trip> tripDetails = TripDButill.retTripDetails();
			request.setAttribute("tripDetails", tripDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("TripSummery.jsp");
			dis.forward(request, response);
			}
		
		else {
			RequestDispatcher dis = request.getRequestDispatcher("unsucess.jsp");
			dis.forward(request, response);
			}

		}
	}
