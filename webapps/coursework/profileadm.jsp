<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!DOCTYPE html>
<html>
<head>
	<title>Profile_admin</title>
	<link rel="stylesheet" href="main.css" type="text/css">
</head>
<body>
<div class="main">
	<div class="block1"> 
		<a href="changepswd.jsp">Change password | </a>
		<a href="mainadm.html">Main page | </a> 
		<a style="margin-right: 10px;" href="Logout">Log out</a>
	</div>
	<div class="block2">
		<div class="block3">
			<a href="allticketadm.jsp"> All ticket</a><br>
			<a href="createadm.jsp">Create ticket</a>
		</div>
		<div class="info">
			Name: <% out.println(session.getAttribute("name") + " ");%><br>
			User info: <%out.println(session.getAttribute("user"));
			%><br>
			<% 
			if(session.getAttribute("user").equals("administrator")){
				out.println("List of people:" + "<br>");
				Cookie[] cookies = request.getCookies();
	 			for(Cookie c: cookies) {
	 				String str;
	 				str = c.getName();
	 				if(!str.equals("JSESSIONID")) out.println(str + ";" + "<br>");
	 			}
			}
			%>
			<form action="Remove" method="POST">
				<input type="text" name="name">
				<input type="submit" value="Remove">
			</form>
		</div>
	</div>
</div>
</body>
</html>