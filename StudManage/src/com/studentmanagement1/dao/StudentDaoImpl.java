package com.studentmanagement1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentmanagement1.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	SessionFactory sessionFactory;
	
	
/*	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
*/
	public void addStudent(Student student) {

	Session session= sessionFactory.openSession();
	Transaction t = session.beginTransaction();
	session.save(student);
	session.flush();
	t.commit();
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
