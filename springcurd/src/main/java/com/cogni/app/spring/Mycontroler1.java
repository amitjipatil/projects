package com.cogni.app.spring;

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
		employeeService.getData();
		
		ModelAndView andView=new ModelAndView("display");
		//Integer a=new Integer(pageindex);
		andView.addObject("pageindex", page);
		return andView;
		
	}

}
