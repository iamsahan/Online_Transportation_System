<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="SheduleATrip.css">
</head>
<body>
	 <div class="header">
	 
            <div class="navbar">
                <div class="logo">
                    <a href="#"><img src="images/logo.png"></a>
                </div>
                <div class="menu">
                    <ul>
                        <li>Home</li>
                        <li>About</li>
                        <li>Services</li>
                        <li class="active">Plan a Trip</li>
                        <li>Contact</li>
                    </ul>
                </div>
                <div class="login-btn"><a href="CustomerLogin.jsp">Logout</a></div>
            </div> 

        <div class="book">
            <img class="bodyimg" src="images/Uber-Taxi-small.webp">
            <h2>How much does a ride with SurfRide cost?</h2>
            <p>Plan your next trip with the price estimator. <br>
                Know before you go, so there’s no math and no surprises.
            </p>
            <form action="shedule" method="post">
                <input type="text" class="icon1" name="pick" placeholder="Enter Destination location">
                <input type="text" class="icon2" name="drop" placeholder="Enter Destination location">
                <p class="tag">Select Vehicle Type</p>
                <div class="radio">
                    <i class="icon"><img src="images/bicycle.png"></i>
                    <input type="radio" class="veh"  name="type" value="bike">

                    <i class="icon"><img src="images/tuk-tuk.png"></i>
                    <input type="radio" class="veh"  name="type" value="tuk">

                    <i class="icon"><img src="images/car.png"></i>
                    <input type="radio" class="veh"  name="type" value="car">

                    <i class="icon"><img src="images/van.png"></i>
                    <input type="radio" class="veh"  name="type" value="van">
                </div>
                
                <input type="submit" value="Shedule A Trip" id="button">
            </form>
        </div>
    </div>

</body>
</html>