package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDAO;
import com.dao.StudentFactory;
import com.model.Student;

@WebServlet("/updateform")
public class StudentUpdateFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentDAO dao;

	@Override
	public void init() throws ServletException {
		dao = StudentFactory.getStudentFactory();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse responce)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));

		Student student = dao.findStudentById(id);

		request.setAttribute("student", student);

		request.getRequestDispatcher("updateform.jsp").forward(request, responce);
	}
}
