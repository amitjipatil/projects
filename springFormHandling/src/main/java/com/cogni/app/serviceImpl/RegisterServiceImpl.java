package com.cogni.app.serviceImpl;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cogni.app.bean.StudentForm;
import com.cogni.app.dao.RegisterDao;
import com.cogni.app.domain.Student;
import com.cogni.app.dto.StudentDto;
import com.cogni.app.service.RegisterService;


public class RegisterServiceImpl implements RegisterService {

	@Resource
	RegisterDao registerdao;

	public void addStudent(StudentDto studentDto) {

		System.out.println("in service");
		Student student=new Student();
		
		student.setId(studentDto.getId());
		student.setName(studentDto.getName());
		student.setAge(studentDto.getAge());
		student.setAddress(studentDto.getAddress());
		
		
		registerdao.addStudent(student);
		

	}

	public List getStudent() {
		return registerdao.getStudent();
		 
	}

}
