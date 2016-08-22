package com.cogni.app.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javassist.bytecode.Descriptor.Iterator;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.cogni.app.dao.EmployeeDao;
import com.cogni.app.entity.EmployeeEntity;
import com.cogni.app.model.Employee;
import com.cogni.app.util.GetConnection;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	
	public List getData() {
		System.out.println("come here");
		
	   Session ses=GetConnection.getSession();
	   String hql = "FROM EmployeeEntity";
	   Query query = ses.createQuery(hql);
	   List <EmployeeEntity> list1=query.list();
	   
	   
	   return list1;
	}

}
