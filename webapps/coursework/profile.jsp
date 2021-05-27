<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!DOCTYPE html>
<html>
<head>
	<title>Profile</title>
	<link rel="stylesheet" href="main.css" type="text/css">
</head>
<body>
<div class="main">
	<div class="block1"> 
		<a href="changepswd.jsp">Change password | </a>
		<a href="main.html">Main page | </a> 
		<a style="margin-right: 10px;" href="Logout">Log out</a>
	</div>
	<div class="block2">
		<div class="block3">
			<a href="allticket.jsp"> All ticket</a><br>
			<a href="createadm.jsp">Create ticket</a>
		</div>
		<div class="info">
			Name: <% out.println(session.getAttribute("name") + " ");%><br>
			User info: <%out.println(session.getAttribute("user"));
			%><br>
		</div>
	</div>
</div>
</body>
</html>