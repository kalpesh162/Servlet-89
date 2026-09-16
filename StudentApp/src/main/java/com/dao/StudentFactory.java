package com.dao;

public class StudentFactory {
	
	public static StudentDAO getStudentFactory() {
		 return new StudentDAOImpl();
	}

}
