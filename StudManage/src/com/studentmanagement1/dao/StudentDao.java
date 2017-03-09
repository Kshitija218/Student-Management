package com.studentmanagement1.dao;

import java.util.List;

import com.studentmanagement1.model.Student;

public interface StudentDao {

	public void addStudent(Student student);
	public Student getStudent();
	public void deleteStudent(Student student);
	public List<Student> listOfStudent();
	
}
