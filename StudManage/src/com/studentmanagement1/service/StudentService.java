/**
 * 
 */
package com.studentmanagement1.service;

import java.util.List;

import com.studentmanagement1.model.Student;
import com.studmanagement1.bean.LoginBean;

/**
 * @author Kshitija
 *
 */
public interface StudentService {

	public void addStudent(Student student);
	public Student getStudent();
	public void deleteStudent(Student student);
	public List<Student> listOfStudent();
	public Student validateStudent(LoginBean login);
	
	
}
