package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {
	
	int addStudent(Student addStudent);
	
	List<Student> getAllStudents();

}
