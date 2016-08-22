package com.cogni.app.spring;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cogni.app.model.Employee;
import com.cogni.app.service.EmployeeService;
import com.cogni.app.serviceImpl.EmployeeServiceImpl;

//import com.cogni.app.service.EmployeeService;
//import com.cogni.app.serviceImpl.EmployeeServiceImpl;

@Controller
public class Mycontroler1 {
	@RequestMapping(value="/display",method = RequestMethod.GET)
	public ModelAndView display(@RequestParam int page)
	{
		EmployeeService employeeService=new EmployeeServiceImpl();
		List l=employeeService.getData();
		ModelAndView andView=new ModelAndView("display");
		andView.addObject("elist",l);
		return andView;
		
	}

}
