package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDAO {

	int addStudent(Student student);

	List<Student> getAllStudents();

	int deleteStudent(int id);

	Student findStudentById(int id);

	int updateStudent(Student student);
}
