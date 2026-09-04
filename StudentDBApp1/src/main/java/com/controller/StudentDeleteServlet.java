package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;

@WebServlet("/delete")
public class StudentDeleteServlet extends HttpServlet {
	
	private StudentDao dao;  // instance Field

	// one time intialization
	@Override
	public void init() throws ServletException {
		dao = new StudentDaoImpl();

	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		int id = Integer.parseInt(req.getParameter("id"));

		StudentDao dao = new StudentDaoImpl();

		int res = dao.deleteStudent(id);

		if (res > 0)
			out.print("<h1> SUCCESS !!! </h1>");
		else
			out.print("<h1> Failed To Add  !!! </h1>");

	}

}
