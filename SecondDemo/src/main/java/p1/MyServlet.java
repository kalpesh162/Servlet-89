package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	
	// service method
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
			
		resp.setContentType("text/html");
		
		PrintWriter out=resp.getWriter();
		
		out.print("<body>");
		
		out.print("<h1>");
		out.print("Hello  Kalpesh !!!");
		out.print("</h1>");
		
		out.print("</body>");
		
	
	}

}
