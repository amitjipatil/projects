package com.cogni.control;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cogni.model.Student;

//setter injection with Beanfactory container and list data type
public class Client {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("springbeans.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Student student=(Student)beanFactory.getBean("bean1");
		System.out.println("id= "+student.getId());
		System.out.println("name= "+student.getName());
	
		for(String s:student.getSt())
		{
			System.out.print(s+" ");
		}
		
		
		
	}

}
