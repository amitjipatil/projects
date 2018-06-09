package com.cogni.app.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cogni.app.bean.LoginForm;
import com.cogni.app.bean.StudentForm;
import com.cogni.app.bean.validator.LoginFormValidator;
import com.cogni.app.domain.Student;
import com.cogni.app.service.RegisterService;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class LoginController {

	@RequestMapping(value = "/login")
	public ModelAndView loginForm(ModelMap model) {
		LoginForm login = new LoginForm();
		model.addAttribute("login", login);
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/checklogin")
	public ModelAndView checkAuthentication(ModelMap model,
			@ModelAttribute(value = "login") @Valid LoginForm login,BindingResult result) {
		
		if(result.hasErrors())
		{
			return new ModelAndView("login");
		}
		
		
		// Student student=new Student();
		if (login.getUserid().equals("asdf")
				&& login.getPassword().equals("asdf123")) {
			StudentForm studentForm = new StudentForm();
			model.addAttribute("studentForm", studentForm);
			return new ModelAndView("redirect:register");
		} else {
			model.addAttribute("ErrorMessage", "Invalid credentials...");
		}
		return new ModelAndView("login");

	}//chechAuth() close
	
	@InitBinder("login")
    public void formInitBinder(WebDataBinder webDataBinder) {
        final LoginFormValidator loginfomvldtr = new LoginFormValidator() ;
        webDataBinder.setValidator(loginfomvldtr);
    }
}
