package com.cogni.app.spring;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cogni.app.service.EmployeeService;
import com.cogni.app.serviceImpl.EmployeeServiceImpl;

//import com.cogni.app.service.EmployeeService;
//import com.cogni.app.serviceImpl.EmployeeServiceImpl;

@Controller
public class Mycontroler1 {
	@RequestMapping("/display")
	public ModelAndView display(@RequestParam int page)
	{
		
		System.out.println("*******"+page);
		
		EmployeeService employeeService=new EmployeeServiceImpl();
		List l=employeeService.getData();
		System.out.println("=====");
		
		ModelAndView andView=new ModelAndView("display");
		//Integer a=new Integer(pageindex);
		andView.addObject("elist",l);
		return andView;
		
	}

}
