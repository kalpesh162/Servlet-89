package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDAO;
import com.dao.StudentFactory;
import com.model.Student;

@WebServlet("/read")
public class StudentReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentDAO studentDAO;

	@Override
	public void init() throws ServletException {

		studentDAO = StudentFactory.getStudentFactory();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String sort = request.getParameter("sort");

		String order = request.getParameter("order");

		List<Student> list = null;

		if (sort == null && order == null)
			list = studentDAO.getAllStudents();

		else {

			if (sort == null || sort.isEmpty()) {
				sort = "id";
			}

			if (order == null || order.isEmpty()) {
				order = "asc";
			}

		}

		if (sort != null)
			list = studentDAO.getAllStudents(sort, order);

		request.setAttribute("data", list);

		request.setAttribute("sort", sort);

		request.setAttribute("order", order);

		request.getRequestDispatcher("/display.jsp").forward(request, response);

	}

}
