import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Remove extends HttpServlet {
	 public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 	resp.setContentType("text/html;charset=utf-8");
	 	PrintWriter out = resp.getWriter();
	 	String name = req.getParameter("name");
	 	out.println("<html><body>");
	 	Cookie[] cookies = req.getCookies();
    	if (cookies != null){
        	for (Cookie c : cookies){
        		if(c.getName().equals(name)){
            		c.setMaxAge(0);
            		resp.addCookie(c);
            	}
            }
        }
        req.getRequestDispatcher("mainadm.html").forward(req, resp);
        out.println("</body></html>");
        out.close();
	 }
}