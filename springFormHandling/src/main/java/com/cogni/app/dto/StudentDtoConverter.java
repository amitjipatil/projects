package com.cogni.app.dto;

import com.cogni.app.bean.StudentForm;

public class StudentDtoConverter {
	public static StudentDto transpherStudentFormToDto(StudentForm studentForm)
	{
		StudentDto studentDto=new StudentDto();
		studentDto.setName(studentForm.getName());
		studentDto.setId(studentForm.getId());
		studentDto.setAge(studentForm.getAge());
		studentDto.setAddress(studentForm.getAddress());
		
		
		return studentDto;
	}

}
