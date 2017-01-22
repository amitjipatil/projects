package com.cogni.app.bean.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cogni.app.bean.LoginForm;

public class LoginFormValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return LoginForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userid", "uid.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "pwd.required");
        		
	}

	

}
