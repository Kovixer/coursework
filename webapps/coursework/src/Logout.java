import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Logout extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
		req.getRequestDispatcher("index.html").include(req, resp);
        HttpSession session = req.getSession(false);
        session.invalidate();
		out.println("</html></body>");
        out.close();
    }
}