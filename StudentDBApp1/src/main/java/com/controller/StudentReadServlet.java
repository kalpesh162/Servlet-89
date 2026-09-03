package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.model.Student;

//@WebServlet(value = "/show")
@WebServlet("/show")
public class StudentReadServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		StudentDao dao = new StudentDaoImpl();

		List<Student> list = dao.getAllStudents();
		out.print("<body>");
		
		
		
		System.out.println(list);
		out.print("<table style='width:100%'> ");
		out.print("<tr>");
		out.print("<th>"+"Id"+"</th>");
		out.print("<th>"+"Name"+"</th>");
		out.print("<th>"+"Marks"+"</th>");
		out.print("</tr>");
		
		for(Student student:list) {
			out.print("<tr>");
			out.print("<td>"+student.getId()+"</td>");
			out.print("<td>"+student.getName()+"</td>");
			out.print("<td>"+student.getMarks()+"</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		out.print("</body>");
		
		

	}

}
