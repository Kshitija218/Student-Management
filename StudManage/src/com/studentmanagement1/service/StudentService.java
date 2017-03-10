/**
 * 
 */
package com.studentmanagement1.service;

import java.util.List;

import com.studentmanagement1.model.Student;

/**
 * @author Kshitija
 *
 */
public interface StudentService {

	public void addStudent(Student student);
	public Student getStudent();
	public void deleteStudent(Student student);
	public List<Student> listOfStudent();
	
	
}
