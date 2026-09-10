package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogOutServlet")
public class LogOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<hr>");
		out.print("<h2>");
		out.print("<a href='login.html'> LOGIN </a>    ");
		out.print("<a href='ProfileServlet'> PROFILE </a>  ");
		out.print("<a href='LogOutServlet'> LOGOUT </a>   ");
		out.print("</h2>");
		out.print("<hr>");

		out.print("<h1>  SUCCESS LOGOUT  ⏻ </h1>");

		HttpSession session = request.getSession();

		session.invalidate();

		out.print("</h1>");

	}

}
