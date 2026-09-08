package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/DemoServlet")

public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DemoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// How to Read web.xml init param

		ServletConfig config = getServletConfig();
		out.print("<h1>");
		out.print(config.getInitParameter("url"));
		out.print("</h1>");
		out.print("<hr>");
		ServletContext context=getServletContext();
		out.print("<h1>");
		out.print(context.getInitParameter("admin"));
		out.print("</h1>");
		

	}

}
