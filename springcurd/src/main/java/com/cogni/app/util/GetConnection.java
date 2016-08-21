package com.cogni.app.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class GetConnection {

	public static Session getSession() {
		System.out.println("In session");
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg = cfg.configure("hibernate.cfg.xml");
		System.out.println("out session");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		return session;
	}
}
