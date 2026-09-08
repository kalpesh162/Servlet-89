package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FirstServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
			String name=request.getParameter("uname");
			
			out.print("<h1>"+name +"</h1>");
			
			// Create Cookie
			
			Cookie cookie=new Cookie("ckid", name.toUpperCase());
			
			// add Cookie responce so that in browser it can store
			response.addCookie(cookie);
		
			out.print("<br>");
		    out.print("<h1>");
		    out.print("<a href='SecondServlet'>"+" NEXT  "+"</a>");
		    out.print("</h1>");
		
	
	
	}

}
