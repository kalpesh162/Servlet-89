package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDAO;
import com.dao.StudentFactory;
import com.model.Student;

@WebServlet("/update")
public class StudentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentDAO dao;

	@Override
	public void init() throws ServletException {
		dao = StudentFactory.getStudentFactory();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		double marks = Double.parseDouble(req.getParameter("marks"));

		Student student = new Student(name, marks);

		student.setId(id);

		int res = dao.updateStudent(student);

		if (res > 0) {
			out.print("<h1>SUCCESSFULLY UPDATED !!!</h1>");
			req.getRequestDispatcher("/read").forward(req, resp);
		} else {
			out.print("<h1>Failed To Update !!!</h1>");
		}
	}

}
