<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>Profile</title>
	<link rel="stylesheet" href="main.css" type="text/css">
</head>
<body>
<div class="main">
	<div class="block1"> 
		<a href="Profile">Profile | </a> 
		<a style="margin-right: 10px;" href="Logout">Log out</a>
	</div>
	<div class="block2">
		<div class="block3">
			<a href="allticket.jsp"> All ticket</a><br>
			<a href="create.jsp">Create ticket</a>
		</div>
		<div class="info">
			<form action="Changepswd" method="POST">
				<input type="password" name="oldpswd">
				<input type="password" name="newpswd">
				<input class="button" type="submit" value="Create">
			</form>
		</div>
	</div>
</div>
</body>
</html>