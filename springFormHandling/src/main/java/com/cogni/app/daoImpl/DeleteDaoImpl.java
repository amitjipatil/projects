package com.cogni.app.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import com.cogni.app.dao.DeleteDao;
import com.cogni.app.domain.Student;

public class DeleteDaoImpl implements DeleteDao {
	
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
	public void deleteStudent(int id) {
		try {
			System.out.println("id="+id);
			
			Session session = hibernateSessionFactory.openSession();
			Student student = (Student)session.get(Student.class, new Integer(id ));
			String addrs=student.getAddress();
			System.out.println("address===== "+addrs);
			session.delete(student);
			session.beginTransaction().commit();
			System.out.println("---------- Deletion done ------------");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception in hibernate");
		}
		
		
	}

}
