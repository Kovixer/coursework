import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Changepswd extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		req.getRequestDispatcher("main.html").include(req, resp);
		String oldpswd = req.getParameter("oldpswd");
		String newpswd = req.getParameter("newpswd");
		HttpSession session = req.getSession();
		Cookie[] cookies = req.getCookies();
		if(session.getAttribute("user").equals("user")){ 
		 	for(Cookie c: cookies){
		 		if(session.getAttribute("name").equals(c.getName())){
		 			if(session.getAttribute("password").equals(oldpswd)){
		 				c.setValue(newpswd);
		 				resp.addCookie(c);
		 			}
		 			else{
		 				pw.println("Error password");
		 			}
		 		}
		 	}
		}
		else{
			pw.println("<html><body>");
			try{
				if(session.getAttribute("password").equals(oldpswd)){
					PrintWriter writer = new PrintWriter(new FileOutputStream("C:/Program Files (x86)/Apache Software Foundation/Tomcat 9.0/webapps/coursework/src/adminpswd.txt",false));
					writer.println(newpswd);
					writer.close();
				}	
			}
			catch(Exception e){}
		}
		
		
		pw.println("</html></body>");
		pw.close();
	}
}