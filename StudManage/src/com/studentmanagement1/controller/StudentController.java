/**
 * 
 */
package com.studentmanagement1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.studentmanagement1.model.Student;
import com.studentmanagement1.service.StudentService;
import com.studmanage.bean.StudentBean;

/**
 * @author Kshitija
 *
 */

@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveStudent(StudentBean studentBean, BindingResult result){
		
		Student student=beanTOEntity(studentBean);
		service.addStudent(student);
		return null;
		
	}

	private Student beanTOEntity(StudentBean studentBean) {

		Student student = new Student();
		student.setStudId(studentBean.getStudId());
		student.setStudName(studentBean.getStudName());
		return student;
		
	}
	
	
	
}
