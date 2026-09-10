package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// How to get Sesssion Object

		HttpSession session = request.getSession();
		Integer cnt = 1;

		if (session.getAttribute("cnt") != null) {

			cnt = (Integer) session.getAttribute("cnt") + 1;
			session.setAttribute("cnt", cnt);

		} else {
			session.setAttribute("cnt", 1);
			session.setMaxInactiveInterval(120);
		}

		out.print("<h1>");

		out.print("VISIT COUNT  " + cnt + "<br>");

		out.print("Session ID" + session.getId() + " <br>");
		out.print("Session CreationTime  " + session.getCreationTime() + " <br>");
		out.print("Session CreationTime  " + new Date(session.getCreationTime()) + " <br>");
		out.print("Session LastAccesssTime  " + session.getLastAccessedTime() + " <br>");
		out.print("Session LastAccesssTime  " + new Date(session.getLastAccessedTime()) + " <br>");
		out.print("Session Interval  " + session.getMaxInactiveInterval());

		out.print("</h1>");

	}

}
