<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="CustomerUpdate.css">
</head>
<body>
	
	<%
		String pick = request.getParameter("pick");
		String drop = request.getParameter("drop");
		String vtype = request.getParameter("vtype");
		String email = request.getParameter("email");
	%>

	<div class="topBar">
        <h2></h2>
    </div>
    <div class="sideBar">

    </div>
    <div class="bodyContent">
    
    	<h1>Edit Trip Details</h1>

    		<div class="info">
    			<form method="post" action="tupdate">
    				
    				<h3>Pickup Address:</h3>
    				<input type="text" name="pick" value="<%= pick %>"><hr>
    				
    				<h3>Destination Address:</h3>
    				<input type="text" name="drop" value="<%= drop %>"><hr>
    				
    				<h3>Vehicle Type:</h3>
    				<input type="text" name="vtype" value="<%= vtype %>"><hr>
    				
    				<h3>Email:</h3>
    				<input type="text" name="email" value="<%= email %>" readonly><hr><br>
    				
    				<input type="submit" name="submit" value="update" id="button">
    			
    			</form>
	    	
	    	</div>		

    </div>

</body>
</html>