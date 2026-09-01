package p1;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet {
	
	static {
		System.out.println("Static Block HelloServlet");
	}
	
	public HelloServlet() {
	   System.out.println("HelloServlet Constructro");
	}

	@Override
	public void destroy() {
		System.out.println("Servlet Destroy  Called");

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("Servlet Init Called");

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servlet Service method Called");

	}

}
