import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Signin extends HttpServlet {
	 public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 	resp.setContentType("text/html;charset=utf-8");
	 	PrintWriter out = resp.getWriter();
	 	String name = req.getParameter("name");
	 	String password = req.getParameter("password");
	 	out.println("<html><body>");
	 	HttpSession session = req.getSession(true);
	 	FileReader fp = new FileReader("C:/Program Files (x86)/Apache Software Foundation/Tomcat 9.0/webapps/coursework/src/adminpswd.txt");
		BufferedReader read = new BufferedReader(fp);
	 	int flag = -1;
	 	String pswd = new String("");
	 	pswd = read.readLine();
	 	if (name.equals("Valentin")){
	 		if (password.equals(pswd)){
	 			req.getRequestDispatcher("mainadm.html").include(req, resp);
	 			session.setAttribute("name", name);
				session.setAttribute("password", password);
				String user = "administrator";
				session.setAttribute("user", user);
				flag = 0;
	 		}
        }
	 	Cookie[] cookies = req.getCookies(); 
	 	for(Cookie c: cookies) {
            if(name.equals(c.getName()) && password.equals(c.getValue())) {
            	req.getRequestDispatcher("main.html").include(req, resp);
            	session.setAttribute("name", name);
				session.setAttribute("password", pswd);
				String user = "user";
				session.setAttribute("user", user);
				flag = 1;
				break;
            }
        }
        if (flag == -1){
        	req.getRequestDispatcher("Login.html").include(req, resp);
        }
        out.println("</body></html>");
        out.close();
	 }
}