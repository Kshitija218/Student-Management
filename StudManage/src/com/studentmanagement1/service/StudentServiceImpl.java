/**
 * 
 */
package com.studentmanagement1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.studentmanagement1.dao.StudentDao;
import com.studentmanagement1.model.Student;

/**
 * @author Kshitija
 *
 */
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao studentdao;
	@Override
	public void addStudent(Student student) {
		
		studentdao.addStudent(student);
	}

	@Override
	public Student getStudent() {
		return null;
	}

	@Override
	public void deleteStudent(Student student) {
		
	}

	@Override
	public List<Student> listOfStudent() {
		return null;
	}

	
}
