package com.cogni.app.serviceImpl;

import javax.annotation.Resource;

import com.cogni.app.bean.StudentForm;
import com.cogni.app.dao.UpdateDao;
import com.cogni.app.dto.StudentDto;
import com.cogni.app.dto.StudentDtoConverter;
import com.cogni.app.service.UpdateService;

public class UpdateServiceImpl implements UpdateService{

	@Resource
	UpdateDao updateDao;
	
	@Override
	public StudentForm updateStudent(int id) {
		
		StudentDto studentDto=updateDao.updateStudent(id);
		StudentForm studentForm=StudentDtoConverter.transpherDtoToStudentForm(studentDto);
		return studentForm;
	}
	

}
