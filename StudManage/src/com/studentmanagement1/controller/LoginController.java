/**
 * 
 */
package com.studentmanagement1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.studentmanagement1.model.Student;
import com.studentmanagement1.service.StudentService;
import com.studmanagement1.bean.LoginBean;

/**
 * @author Kshitija
 *
 */
@Controller
public class LoginController {

	@Autowired
	public StudentService service;
	
	
	
	@RequestMapping(value= "/student/login", method = RequestMethod.POST)
	public void addStudent(@ModelAttribute("studentLogin") LoginBean login ){
		
		Student student=service.validateStudent(login);
		System.out.println("login successful" +student);
	}
	
	
	
}
