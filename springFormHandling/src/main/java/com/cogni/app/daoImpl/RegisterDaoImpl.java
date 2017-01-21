package com.cogni.app.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cogni.app.dao.RegisterDao;
import com.cogni.app.domain.Student;


public class RegisterDaoImpl implements RegisterDao {

	@Autowired
	private SessionFactory hibernateSessionFactory;

	public SessionFactory getHibernateSessionFactory() {
		return hibernateSessionFactory;
	}

	public void setHibernateSessionFactory(
			SessionFactory hibernateSessionFactory) {
		this.hibernateSessionFactory = hibernateSessionFactory;
	}

	public void addStudent(Student student) {
		System.out.println("ssssssssssssss" + student.getName());
		try {

			Session session = hibernateSessionFactory.openSession();
			session.saveOrUpdate(student);
			session.beginTransaction().commit();
			System.out.println("***** Registration done ******");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List getStudent() {
		Query q1 = null;
		System.out.println("in get student");
		try {

			Session session = hibernateSessionFactory.openSession();
			// Criteria cr=session.createCriteria(arg0)
			q1 = session.createQuery("from Student");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return q1.list();

	}
	

	

	

}
