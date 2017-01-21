package com.cogni.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cogni.app.bean.StudentForm;
import com.cogni.app.service.RegisterService;
import com.cogni.app.service.UpdateService;

/**
 * @author amit
 *
 */
@Controller
public class UpdateController {

	@Resource
	UpdateService updateService;
	@Resource
	RegisterService registerservice;
	
	@RequestMapping(value = "/update")
	public ModelAndView updateRecord(@RequestParam("id") int id, ModelMap model) {

		StudentForm studentform = updateService.updateStudent(id);
		model.addAttribute("studentForm", studentform);
		List list = new ArrayList();
		list = registerservice.getStudent();
		model.addAttribute("slist", list);
		return new ModelAndView("register");

	}
}
