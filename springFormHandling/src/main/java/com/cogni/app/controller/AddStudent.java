package com.cogni.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cogni.app.bean.StudentForm;
import com.cogni.app.domain.Student;
import com.cogni.app.dto.StudentDto;
import com.cogni.app.dto.StudentDtoConverter;
import com.cogni.app.service.RegisterService;

@Controller
public class AddStudent {

	@Resource
	RegisterService registerservice;

	@RequestMapping(value = "/register")
	public ModelAndView display(ModelMap model) {
		
		List list = new ArrayList();
		list = registerservice.getStudent();
		model.addAttribute("studentForm", new StudentForm());
		model.addAttribute("slist", list);
		return new ModelAndView("register");
	}

	@RequestMapping(value = "/addstudent")
	public ModelAndView addStudent(ModelMap model,
			@ModelAttribute StudentForm studentForm, BindingResult result) {
		StudentDto studentDto = StudentDtoConverter
				.transpherStudentFormToDto(studentForm);
		//result.hasErrors()
		registerservice.addStudent(studentDto);
		model.addAttribute("studentForm", new StudentForm());

		return new ModelAndView("redirect:register");

	}

	/*
	 * @ModelAttribute("list") public java.util.List<Student> getList(){
	 * 
	 * 
	 * 
	 * }
	 */

}
