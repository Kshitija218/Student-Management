package com.studentmanagement1.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.studentmanagement1.model.Student;

public class StudentDaoImpl implements StudentDao{

	@Autowired
	SessionFactory sessionfactory;
	@Override
	public void addStudent(Student student) {

	sessionfactory.getCurrentSession().save(student);
		
	}

	@Override
	public Student getStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> listOfStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
