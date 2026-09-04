package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstPage")
public class FirstPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FirstPage() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	
	out.print("<h1>  Hello  </h1>  <br>");
	
	out.print("<h1>  <a href='bye.html'>  BYE  </a>  <h1>  ");
	
	
	RequestDispatcher rd=request.getRequestDispatcher("bye.html");
	//rd.forward(request, response);
	rd.include(request, response);
	
	
	
	
	
	}

}
