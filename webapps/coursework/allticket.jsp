<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!DOCTYPE html>
<html>
<head>
	<title>all ticket</title>
	<link rel="stylesheet" href="main.css" type="text/css">
</head>
<body>
	
<div class="main">
	<div class="block1"> 
		<a href="main.html">Main page | </a> 
		<a style="margin-right: 10px;" href="Logout">Log out</a>
	</div>
	<div class="block2">
		<div class="block3">
			<a href="allticket.jsp"> All ticket</a>
			
			<a href="create.jsp">Create ticket</a>
		</div>
		<div class="info">
			<form action="Create" method="POST">
				<button type="submit" value="re">load ticket</button>
			</form>
			<%@ page import = "java.util.*"%>
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
			}
			catch(Exception e){}
			%>
		</div>
	</div>
</div>
</body>
</html>