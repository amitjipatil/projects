package com.cogni.app.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cogni.app.dao.UpdateDao;
import com.cogni.app.domain.Student;
import com.cogni.app.dto.StudentDto;
import com.cogni.app.dto.StudentDtoConverter;

/**
 * @author amit
 *
 */
public class UpdateDaoImpl implements UpdateDao {

	@Autowired
	private SessionFactory hibernateSessionFactory;

	public SessionFactory getHibernateSessionFactory() {
		return hibernateSessionFactory;
	}

	public void setHibernateSessionFactory(
			SessionFactory hibernateSessionFactory) {
		this.hibernateSessionFactory = hibernateSessionFactory;
	}
	
	@Override
	public StudentDto updateStudent(int id) {
		StudentDto studentDto=null;
		
		try {
			System.out.println("update id="+id);
			
			Session session = hibernateSessionFactory.openSession();
			Student student = (Student)session.get(Student.class, new Integer(id ));
			String addrs=student.getAddress();
			System.out.println("update address===== "+addrs);
			studentDto=StudentDtoConverter.transpherStudentToDto(student);
			
			//session.beginTransaction().commit();
			//System.out.println("---------- Deletion done ------------");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception in update dao hibernate");
		}
		
		return studentDto;
	}

}
