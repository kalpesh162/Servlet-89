package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDAO;
import com.dao.StudentDAOImpl;
import com.dao.StudentFactory;
import com.model.Student;

@WebServlet("/add")
public class StudentAddServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private StudentDAO studentDAO;

	@Override
	public void init() throws ServletException {

		studentDAO = StudentFactory.getStudentFactory();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("fname");
		double marks =Double.parseDouble(request.getParameter("marks"));
		
		Student student=new Student(name, marks);
		
		
		int noOfRows=studentDAO.addStudent(student);
		
		if(noOfRows>0) {
			  request.getRequestDispatcher("/read").forward(request, response);
		}
		else {
	       // error.jsp		
		}
	
	}

}
