package com.model;

import java.io.Serializable;

public class Student implements Serializable {

	private int id;
	private String name;
	private double marks;

	public Student() {
		setName("");
	}

	public Student(String name, double marks) {
		setName(name);
		setMarks(marks);
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}

		for (char c : name.toCharArray()) {
			if (!Character.isLetter(c) && c != ' ') {
				throw new IllegalArgumentException("Name can contain only letters and spaces");
			}
		}

		this.name = name.trim();
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {

		if (marks < 0 || marks > 100) {
			throw new IllegalArgumentException("Marks must be between 0 and 100");
		}

		this.marks = marks;
	}

	@Override
	public String toString() {
		return String.format("Student [id=%d, name=%s, marks=%.2f]", id, name, marks);
	}
}
