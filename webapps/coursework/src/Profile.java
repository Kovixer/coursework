import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Profile extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        HttpSession session = req.getSession();
        if(session.getAttribute("user").equals("administrator")){
			req.getRequestDispatcher("profileadm.jsp").forward(req, resp);
		}
		else{
			req.getRequestDispatcher("profile.jsp").forward(req, resp);
		}
		out.println("</html></body>");
        out.close();
    }
}