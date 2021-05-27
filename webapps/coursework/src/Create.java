import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class Create extends HttpServlet {

	public LinkedList<String> list = new LinkedList<>();
	public LinkedList<String> stat = new LinkedList<>();

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		HttpSession session = req.getSession();
		String name1 = req.getParameter("r1");
        String name2 = req.getParameter("rall");
        String name3 = req.getParameter("rmv");
        String num = req.getParameter("num");
        String name4 = req.getParameter("cngst");
        if (name2 != null){
        	deleteAll(req, resp);
        }
        if (name1 != null && name3 != null && name2 == null){
        	int number = 0;
			try {
		   		number = Integer.parseInt(name3);
			}
			catch (NumberFormatException e){}
			number--;
        	deleteOne(req, resp, number);
        }
        if (name4 != null & num != null){
        	int number = 0;
			try {
		   		number = Integer.parseInt(num);
			}
			catch (NumberFormatException e){}
			number--;
			changeStatus(req, resp, number);
        }
		String ticket = req.getParameter("pere");
		String description = req.getParameter("description");
		String responsible = req.getParameter("responsible");
		String status = "status: open;";
		String file = req.getParameter("file");
		String button = req.getParameter("re");
		String str = ticket + "; description: " + description + "; responsible: " + responsible + ";";
		if (ticket != null){
			list.add(str);
			stat.add(status);
		}
		req.setAttribute("list", list);
		req.setAttribute("status", stat);
		if(session.getAttribute("user").equals("administrator")){
			req.getRequestDispatcher("allticketadm.jsp").forward(req, resp);
		}
		else{
			req.getRequestDispatcher("allticket.jsp").forward(req, resp);
		}
		String line = list.getLast();
		try{
			PrintWriter writer = new PrintWriter(new FileOutputStream("C:/Program Files (x86)/Apache Software Foundation/Tomcat 9.0/webapps/coursework/src/text.txt",true));
			writer.println(line);
			writer.close();
		}
		catch(Exception e){}
		pw.close();
	}

	public void deleteAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		list.clear();
		stat.clear();
		req.setAttribute("list", list);
		req.getRequestDispatcher("allticketadm.jsp").forward(req, resp);
	}

	public void deleteOne(HttpServletRequest req, HttpServletResponse resp, int number) throws ServletException, IOException{
		list.remove(number);
		stat.remove(number);
		req.setAttribute("list", list);
		req.getRequestDispatcher("allticketadm.jsp").forward(req, resp);
	}

	public void changeStatus(HttpServletRequest req, HttpServletResponse resp, int number) throws ServletException, IOException{
		stat.remove(number);
		String status = "status: close;";
		stat.add(number, status);
		req.setAttribute("status", stat);
		req.getRequestDispatcher("allticketadm.jsp").forward(req, resp);
	}
}