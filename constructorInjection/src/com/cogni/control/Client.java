package com.cogni.control;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cogni.model.Student;


// constructor injecgion with applicationcontext container and object typed data, list type data

public class Client {

	public static void main(String[] args) {
		//Resource resource=new ClassPathResource("springbeans.xml");
		ApplicationContext context= new ClassPathXmlApplicationContext("springbeans.xml");
		Student student=(Student)context.getBean("bean1");
		student.display();
		
	}

}
