package com.studentmanagement1.dao;

import java.util.List;

import com.studentmanagement1.model.Student;
import com.studmanagement1.bean.LoginBean;

public interface StudentDao {

	public void addStudent(Student student);
	public Student getStudent();
	public void deleteStudent(Student student);
	public List<Student> listOfStudent();
	public Student validateStudent(LoginBean login);
	
}
