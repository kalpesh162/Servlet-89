package com.dao;

public class StudentFactory {
	
	private StudentFactory(){}
	
	public static StudentDAO getStudentFactory() {
		 return new StudentDAOImpl();
	}

}
