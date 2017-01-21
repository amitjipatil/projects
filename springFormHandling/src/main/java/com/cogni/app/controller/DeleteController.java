package com.cogni.app.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cogni.app.service.DeleteService;
import com.cogni.app.serviceImpl.DeleteServiceImpl;



@Controller
public class DeleteController {
	
	@Resource
	DeleteService deleteService;
	
	@RequestMapping(value="/delete")
	public ModelAndView deleteRecord(@RequestParam("id") int id )
	{
		
		deleteService.deleteStudent(id);
		
		
		return new ModelAndView("redirect:register");
		
	}
	

}
