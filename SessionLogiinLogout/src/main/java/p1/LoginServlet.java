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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
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

		String name = request.getParameter("uname");
		String password = request.getParameter("password");
		
		HttpSession session=null;
		
		if(name.equals("Kareena") && password.equals("123")) {
			
			out.print("<p style='font-size:50px'>&#128591;</p>");
			out.print("<h1 style='font-size:50px'>" + "WECOME  🙏    "+name.toUpperCase() +" &#128112  </h1>");
			session=request.getSession();
			session.setAttribute("sessionid", name);
			
		}
		else {
			out.print("<h1> INVALID CREDENTIALS  </h1>");
			request.getRequestDispatcher("login.html").include(request, response);
		}

	}

}
