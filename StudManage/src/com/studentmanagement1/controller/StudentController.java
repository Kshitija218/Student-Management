/**
 * 
 */
package com.studentmanagement1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.studentmanagement1.model.Student;
import com.studentmanagement1.service.StudentService;
import com.studmanagement1.bean.StudentBean;

/**
 * @author Kshitija
 *
 */

@Controller
public class StudentController {

	@Autowired
	public StudentService service;

	
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveStudent(StudentBean studentBean, BindingResult result){
		
		Student student=beanTOEntity(studentBean);
		service.addStudent(student);
		return null;
		
	}
	
	
	@RequestMapping(value= "/student/add", method = RequestMethod.POST)
	public void addPerson(@ModelAttribute("student") Student student){
		
			service.addStudent(student);
		
			System.out.println("you have successfully sign-up........");		
	}
	
	
	

	private Student beanTOEntity(StudentBean studentBean) {

		Student student = new Student();
		student.setStudId(studentBean.getStudId());
		student.setStudName(studentBean.getStudName());
		return student;
		
	}
	
	private StudentBean entityToBean(Student student){
		StudentBean studBean = new StudentBean();
		studBean.setStudId(student.getStudId());
		studBean.setStudName(student.getStudName());
		return studBean;
		
	}
	
}
