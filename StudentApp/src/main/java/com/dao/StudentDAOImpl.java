package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;
import com.utility.DBUtility;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public int addStudent(Student student) {

		String sql = "INSERT INTO STUDENT (name, marks) VALUES (?, ?)";

		try (Connection con = DBUtility.getInstace().getDBConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setString(1, student.getName());
			ps.setDouble(2, student.getMarks());

			return ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public List<Student> getAllStudents() {

		List<Student> studentList = new ArrayList<>();

		String sql = "SELECT id, name, marks FROM STUDENT";

		try (Connection con = DBUtility.getInstace().getDBConnection();
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {

				Student student = new Student(rs.getString("name"),rs.getDouble("marks"));

				student.setId(rs.getInt("id"));
				//student.setName(rs.getString("name"));
				//student.setMarks(rs.getDouble("marks"));

				studentList.add(student);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return studentList;
	}

}
