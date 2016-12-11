package com.cogni.app.service;

import java.util.List;

import com.cogni.app.bean.StudentForm;
import com.cogni.app.domain.Student;
import com.cogni.app.dto.StudentDto;

public interface RegisterService {
	public void addStudent(StudentDto studentDto);

	public List getStudent();

}
