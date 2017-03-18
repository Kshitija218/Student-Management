package com.studentmanagement1.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentmanagement1.model.Student;
import com.studmanagement1.bean.LoginBean;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public static final String s="swapnil";
	
	
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

	@Override
	public Student validateStudent(LoginBean login) {
		
		if(s.equals(login.getUserName())); 
		return null;
		
		/*Session session= sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		String SQL_QUERY =" from Student1 as o where o.userName=? and o.userPassword=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,login.getUserName());
		query.setParameter(1,login.getPassword());
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			System.out.println("login");
		}
		return null;*/
		
	}

}
