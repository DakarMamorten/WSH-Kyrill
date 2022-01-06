package com.k05_01_2020;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseName;
	private List<Student> students = new ArrayList();

	public Course(String courseName) {
		this.courseName = courseName;

	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void roll(Course course) {
		System.out.println("Course name: " + course.courseName);
		System.out.println("Students for the course " + course.courseName + " :");
		System.out.println();
		for (Student student : course.students) {
			System.out.println(student);
			System.out.println();

		}
	}
}