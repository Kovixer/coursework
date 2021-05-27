<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>Create ticket</title>
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
			<form action="Create" method="POST">
				<input type="radio" name="pere" value="Feature">Feature
				<input type="radio" name="pere" value="Bug">Bug
				<br>
				Description:<br>
				<textarea class="pole" name="description" required=""></textarea><br>
				Responsible:<br>
				<input class="pole" type="text" name="responsible" required=""><br>
				<input class="button" type="file" name="file"><br>
				<input class="button" type="submit" value="Create">
			</form>
		</div>
	</div>
</div>
</body>
</html>