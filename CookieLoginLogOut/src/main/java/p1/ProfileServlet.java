package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
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
		
		Cookie ck[] = request.getCookies();
		
		if (ck != null) {
		
			out.print("<h1>  WELCOME TO PROFILE  !!!!     ......");
			
			for (Cookie data : ck) {
				out.print(data.getName() + "  ");
				out.print(data.getValue());
				out.print("<br>");
			}
			out.print("</h1>");
		}
		
		else {
			out.print("<h1> SESSION EXPIRES PLEASE RELOGIN AGIAN  🙏   </h1>");
			request.getRequestDispatcher("login.html").include(request, response);

		}
	}

}
