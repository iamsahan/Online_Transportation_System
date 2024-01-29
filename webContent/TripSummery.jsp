<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Journey Summary</title>
<link rel="stylesheet" href="CustomerProfile.css">
</head>
<body>

	<div class="topBar">
        <h2></h2>
        <a href="SheduleATrip.jsp">Plan a Trip</a>
    </div>
    <div class="sideBar">

    </div>
    <div class="bodyContent">
    
    	<h1>Trip Summary</h1>
    	

    		<c:forEach var="trip" items="${tripDetails}">
    		
    		<c:set var = "tiD" value="${trip.tiD}"/>
    		<c:set var = "pick" value="${trip.pick}"/>
    		<c:set var = "drop" value="${trip.drop}"/>
    		<c:set var = "vtype" value="${trip.vtype}"/>
    		<c:set var = "umail" value="${trip.umail}"/>
    		
    		
    		<div class="info">
	    		<h3>Pickup Address:</h3>
	    		<p>${trip.pick}</p><hr>
	    		
	    		<h3>Destination Address :</h3>
	    		<p>${trip.drop}</p><hr>
	    		
	    		<h3>Vehicle Type:</h3>
	    		<p>${trip.vtype}</p><hr>
	    		
	    		<h3>Email:</h3>
	    		<p>${trip.umail}</p><hr>
	    	</div>	
    		
    		
    		</c:forEach>	
    		
    		<c:url value="TripUpdate.jsp" var="tripupdate">
    			<c:param name="pick" value="${pick}"/>
    			<c:param name="drop" value="${drop}"/>
    			<c:param name="vtype" value="${vtype}"/>
    			<c:param name="email" value="${umail}"/>
    		</c:url>
    	
			<a href="${tripupdate}">Edit Details</a>
			
			<form action="tdelete" method="post">
				
				<input type="submit" value="Cancel Trip">
			</form>
    </div>

</body>
</html>