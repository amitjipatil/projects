package com.cogni.app.dto;

import com.cogni.app.bean.StudentForm;
import com.cogni.app.domain.Student;

public class StudentDtoConverter {
	static StudentDto studentDto=new StudentDto();
	static StudentForm studentForm=new StudentForm();
	
	public static StudentDto transpherStudentFormToDto(StudentForm studentForm)
	{
		
		studentDto.setName(studentForm.getName());
		studentDto.setId(studentForm.getId());
		studentDto.setAge(studentForm.getAge());
		studentDto.setAddress(studentForm.getAddress());
		
		
		return studentDto;
	}
	
	public static StudentDto transpherStudentToDto(Student student)
	{
		
		studentDto.setName(student.getName());
		studentDto.setId(student.getId());
		studentDto.setAge(student.getAge());
		studentDto.setAddress(student.getAddress());
		
		
		return studentDto;
	}
	public static StudentForm transpherDtoToStudentForm( StudentDto studentDto1)
	{
		
		studentForm.setName(studentDto1.getName());
		studentForm.setId(studentDto1.getId());
		studentForm.setAge(studentDto1.getAge());
		studentForm.setAddress(studentDto1.getAddress());
		
		
		return studentForm;
	}

}
