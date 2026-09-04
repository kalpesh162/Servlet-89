package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
			ps.setDouble(3, addStudent.getMarks());

			res = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

		return res;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> stList = new ArrayList<Student>();
		String sql = "SELECT * FROM STUDENT";
		try (Connection con = DBUtility.getInstace().getDBConnection();
				PreparedStatement ps = con.prepareStatement(sql);) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setMarks(rs.getDouble(3));

				stList.add(student);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return stList;
	}

	@Override
	public int updateStudent(Student upstudent) {
		String sql = "UPDATE  STUDENT SET name=? , marks=?  WHERE id=?";

		try (Connection con = DBUtility.getInstace().getDBConnection();
				PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setString(1, upstudent.getName());
			ps.setDouble(2, upstudent.getMarks());
			ps.setInt(3, upstudent.getId());
			return ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteStudent(int id) {
		String sql = "DELETE FROM STUDENT WHERE id=?";
		try (Connection con = DBUtility.getInstace().getDBConnection();
				PreparedStatement ps = con.prepareStatement(sql);) {

			ps.setInt(1, id);
			return ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
