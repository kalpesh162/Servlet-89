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
import com.model.Student;

@WebServlet("/updateForm")
public class StudentUpdateForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int id = Integer.parseInt(request.getParameter("id"));

		StudentDao dao = new StudentDaoImpl();
		
		Student student=dao.findStudentById(id);
		// Need Render Student in form
		
		out.print("<form action='update' method='get'>");
		out.print("ID :" );
		out.print("<input type='text' name='id' value='"+student.getId()+"' readonly />");
		out.print("<br>");
		out.print("Name :" );
		out.print("<input type='text' name='name' value='"+student.getName()+"'/>");
		out.print("<br>");
		out.print("Marks :" );
		out.print("<input type='text' name='marks' value='"+student.getMarks()+"'/>");
		out.print("<br>");
		
		out.print("<input type='submit' value='UPDATE'>");
		out.print("</form>");
		
		

	}

}
