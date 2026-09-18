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

@WebServlet("/delete")
public class StudentDeleteServlet extends HttpServlet {

	private StudentDAO studentDAO;

	@Override
	public void init() throws ServletException {

		studentDAO = StudentFactory.getStudentFactory();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int id = Integer.parseInt(request.getParameter("id"));

		int noOfRows = studentDAO.deleteStudent(id);

		if (noOfRows > 0) {
			request.getRequestDispatcher("/read").forward(request, response);
		} else {
			// error.jsp
		}

	}

}
