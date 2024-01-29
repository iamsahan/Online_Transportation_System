<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="CustomerProfile.css">

 <!-- =========== Scripts =========  -->
		<script src="main.js"></script>
</head>
<body>

	<div class="topBar">
        <h2>Uber Account</h2>
        <a href="SheduleATrip.jsp">Plan a Trip</a>
    </div>
    <div class="sideBar">

    </div>
    <div class="bodyContent">
    
    	<h1>Account Info</h1>
    	

    		<c:forEach var="cus" items="${cusDetails}">
    		
    		<c:set var = "fname" value="${cus.fname}"/>
    		<c:set var = "lname" value="${cus.lname}"/>
    		<c:set var = "email" value="${cus.email}"/>
    		<c:set var = "phone" value="${cus.phone}"/>
    		
    		
    		<div class="info">
	    		<h3>First Name:</h3>
	    		<p>${cus.fname}</p><hr>
	    		
	    		<h3>Last Name:</h3>
	    		<p>${cus.lname}</p><hr>
	    		
	    		<h3>Email:</h3>
	    		<p>${cus.email}</p><hr>
	    		
	    		<h3>Phone:</h3>
	    		<p>${cus.phone}</p><hr>
	    	</div>	
    		
    		
    		</c:forEach>	
    		
    		<c:url value="CustomerUpdate.jsp" var="cstupdate">
    			<c:param name="fname" value="${fname}"/>
    			<c:param name="lname" value="${lname}"/>
    			<c:param name="email" value="${email}"/>
    			<c:param name="phone" value="${phone}"/>
    		</c:url>
    	
			<a href="${cstupdate}">Edit Details</a>
			
			<form action="delete" method="post">
				<input type="hidden" id="confirmDeleteInput" name="confirmDelete" value="false">
				<input type="submit" value="Delete Profile" onclick="confirmDelete(); return false;">
			</form>
    </div>
    
   

</body>

</html>