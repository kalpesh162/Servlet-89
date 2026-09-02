package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.Student;
import com.utility.DBUtility;

public class StudentDaoImpl implements StudentDao {

	@Override
	public int addStudent(Student addStudent) {
		int res = 0;
		String sql = "insert into STUDENT (id,name,marks) values(?,?,?)";
		try (Connection con = DBUtility.getInstace().getDBConnection();
				PreparedStatement ps = con.prepareStatement(sql);) {

			ps.setInt(1, addStudent.getId());
			ps.setString(2, addStudent.getName());
			ps.setDouble(4, addStudent.getMarks());

			res = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}

		return res;
	}
}
