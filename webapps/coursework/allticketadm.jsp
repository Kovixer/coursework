<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!DOCTYPE html>
<html>
<head>
	<title>all ticket_admin</title>
	<link rel="stylesheet" href="main.css" type="text/css">
</head>
<body>
<div class="main">
	<div class="block1"> 
		<a href="mainadm.html">Main page | </a> 
		<a style="margin-right: 10px;" href="Logout">Log out</a>
	</div>
	<div class="block2">
		<div class="block3">
			<a href="allticketadm.jsp"> All ticket</a><br>
			<a href="createadm.jsp">Create ticket</a>
		</div>
		<div class="info">
			<form action="Create" method="POST">
				<button type="submit" value="re">load ticket</button>
			</form>
			<%@ page import = "java.io.*"%>
			<%@	page import = "java.util.LinkedList"%>
			<% 
			int c = 1;
			try{
				String line = new String(""); 
				String stat = new String("");
				LinkedList<String> list = new LinkedList<>();
				list = (LinkedList<String>)request.getAttribute("list");
				LinkedList<String> status = new LinkedList<>();
				status = (LinkedList<String>)request.getAttribute("status");
				for(int i = 0; i < list.size(); i++){
					line = list.get(i);
					stat = status.get(i);
					out.println(c + ") ");
					out.println(line);
					out.println(stat);
					out.println("<br>");
					c++;
				}
				request.setAttribute("list", list);
			}
			catch(Exception e){}
			%>
			<form action="Create" method="POST">
				Remove one ticket: <input class="pole1" type="text" name="rmv">
				<button class="button1" type="submit" name="r1" value="r1">Remove</button>
				<button class="button1" type="submit" name="rall" value="rall">Remove all</button><br>
				Change status of the ticket: <input class="pole1" type="text" name="num">
				<button class="button1" type="submit" name="cngst" value="cngst">Change status</button>
			</form><br>
		</div>
	</div>
</div>
</body>
</html>