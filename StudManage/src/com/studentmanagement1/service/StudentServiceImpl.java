/**
 * 
 */
package com.studentmanagement1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.studentmanagement1.dao.StudentDao;
import com.studentmanagement1.model.Student;
import com.studmanagement1.bean.LoginBean;

/**
 * @author Kshitija
 *
 */
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	@Qualifier(value="studentDaoImpl")
	StudentDao studentdao;

	
	/*public void setStudentdao(StudentDao studentdao) {
		this.studentdao = studentdao;
	}*/

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

	@Override
	public Student validateStudent(LoginBean login) {
		
		
		
		return studentdao.validateStudent(login);
	}

	

	
}
