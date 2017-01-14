package com.cogni.app.dao;


import java.util.List;

import com.cogni.app.domain.Student;

public interface RegisterDao {

	public void addStudent(Student student);

	public List getStudent();

	

}
