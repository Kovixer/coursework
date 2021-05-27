<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>Quateo/mainpage</title>
	</head>
		<link rel="stylesheet" href="main.css" type="text/css">
<body background="java.jpg">
<div>
	<div class="block1">
		<%= HttpServletRequest req;
		HttpSession session = req.getSession();
		PrintWriter pw = resp.getWriter();
		String user = session.getAttribute("user");
		pw.println(user); %>
		<a href="profile.html">Profile | </a><a style="margin-right: 10px" href="logout">Log out</a>
	</div>
	<div class="block2">
		<div class="text"><a href=""> All bugs</a><br><a href="">Create bug</a>
		</div>
	</div>
</div>
</body>
</html>