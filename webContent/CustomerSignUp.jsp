<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="CustomerSignUp.css">
</head>
<body>
	<div class="colorBox">
        <div class="hText">
            <h2>INFORMATION</h2>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nostrum eveniet ipsam sunt 
                laboriosam dolor, iste nesciunt repellendus ad, quasi ullam ab possimus officiis. 
                Labore corrupti delectus sed magnam, qui maiores.</p><br>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Odio aperiam quisquam 
                porro quo dolor. Veniam incidunt doloribus et corporis error assumenda enim eaque 
                distinctio, saepe harum, ipsa nobis officiis voluptate?</p> <br>
                
                <a href="CustomerLogin.jsp">Have An Account</a>   
        </div>
        <div class="inpFiled">
            <form action="insert" method="post">
                <label><b>Full Name</b></label><br>
                <input type="text" id="fname" name="fname" placeholder="Frist Name" required>
                <input type="text" id="lname" name="lname" placeholder="Last Name" required><br>
                <label><b>Email</b></label><br>
                <input type="email" id="email" name="email" placeholder="example@gmail.com" required><br>
                <label><b>Phone</b></label><br>
                <input type="text" id="phone" name="phone" placeholder="0xx-xxxxxxx" minlength="10" maxlength="10" required><br>
                <label><b>Password</b></label><br>
                <input type="text" id="pw" name="pw" placeholder="password" minlength="8" maxlength="8" required><br>
                
                
                <input type ="submit" name="submit" value="Register" id="button">
            </form>
        </div>
    </div>

</body>
</html>