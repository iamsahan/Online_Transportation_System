package com.Trip;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class TripDButill {
	
	private static Connection con = null;
	private static Statement stmt = null;
	public static boolean isSucess;
	public static ResultSet rs = null;
	public static int tid;

	//Trip data insert method
	public static boolean insertTripDetails(String uname, String pick, String drop, String type) {
	
		boolean isInsert = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String query = "insert into trip values(0, '"+uname+"', '"+pick+"', '"+drop+"', '"+type+"')";
			int val = stmt.executeUpdate(query);
			
			if (val > 0) {
				isInsert = true;
			}
			else {
				isInsert = false;
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isInsert;
	}
	
	
	//return trip data from database
		public static List<Trip> getTripDetails() {
			
			ArrayList<Trip> t1 = new ArrayList<>();
			
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String query = "SELECT * FROM trip ORDER BY idtrip DESC LIMIT 1";
				rs = stmt.executeQuery(query);
				
				while (rs.next()) {
					tid = rs.getInt(1);
					String uname = rs.getString(2);
					String pick = rs.getString(3);
					String drop = rs.getString(4);
					String vehicle = rs.getString(5);
					
					Trip trip = new Trip(tid, pick, drop, vehicle, uname);
					
					t1.add(trip);
				}
			}

			catch (Exception e) {
				e.printStackTrace();
			}
			
			return t1;
		}
	
	


//update trip details
	public static boolean updateTrip(String pick, String drop, String vtype) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String query = "update trip set pick_address='"+pick+"',drp_address='"+drop+"',vtype='"+vtype+"'" 
					+ "where idtrip='"+tid+"'";
			int rs = stmt.executeUpdate(query);
			
			if (rs > 0) {
				isSucess = true;
			}
			
			else {
				isSucess = false;
			}
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSucess;
	}
	
	
	
	//retrieve trip data from database after update
		public static List<Trip> retTripDetails() {
			
			ArrayList<Trip> cus = new ArrayList<>();
			
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String query = "select * from trip where idtrip='"+tid+"'";
				rs = stmt.executeQuery(query);
				
				while (rs.next()) {
					tid = rs.getInt(1);
					String email = rs.getString(2);
					String pick = rs.getString(3);
					String drop = rs.getString(4);
					String vtype = rs.getString(5);
					
					
					Trip t1 = new Trip(tid, pick, drop, vtype, email);
					
					cus.add(t1);
				}
			}

			catch (Exception e) {
				e.printStackTrace();
			}
			
			return cus;
		}	
		
		
		//delete trip
		public static boolean deleteTrip() {

			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String query = "delete from trip where idtrip = '"+tid+"'";
				int rs = stmt.executeUpdate(query);
				
				if (rs > 0) {
					isSucess = true;
				}
				
				else {
					isSucess = false;
				}
				
			}
			
			catch (Exception e) {
				e.printStackTrace();
			}
			
			return isSucess;
		}

}
