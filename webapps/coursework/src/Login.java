import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		pw.println("<html><body>");
		if (name == "" || password == ""){
			req.getRequestDispatcher("Login.html").include(req, resp);
		}
		else{
			req.getRequestDispatcher("main.html").include(req, resp);
			HttpSession session = req.getSession();
			session.setAttribute("name", name);
			session.setAttribute("password", password);
			String token = session.getId();
			String user = "user";
			session.setAttribute("user", user);
			session.setAttribute("token", token);
			resp.addCookie(new Cookie(name, password));
		}
		pw.println("</html></body>");
		pw.close();
	}
}