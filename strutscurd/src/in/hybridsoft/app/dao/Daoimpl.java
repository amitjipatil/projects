package in.hybridsoft.app.dao;

import java.util.ArrayList;
import java.util.List;

import in.hybridsoft.app.model.Employee;
import in.hybridsoft.app.util.Myconnection;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.dialect.TeradataDialect;


/**
 * @author amit
 *
 */
public class Daoimpl {
	  
	
	public void savedata(Employee employee)
	{
		System.out.println("in");
        Session session=Myconnection.getSession();
		
		Transaction tx=session.beginTransaction();
		/*Employee employee=new Employee();
		 employee.setEid(59);
		 employee.setEname("maddddy");
		 employee.setSalary(4800);*/
		session.save(employee);
		tx.commit();
		System.out.println("save successfully");
		session.close();
	}
	
	public List getdata()
	{
		Session session=Myconnection.getSession();
		//Transaction tx=session.beginTransaction();
		Criteria criteria=session.createCriteria(Employee.class);
		List list =criteria.list();
		return list;
		
	}
	
	
	public void deletData(int eid)
	{
		Session session=Myconnection.getSession();
		Employee emp=(Employee)session.get(Employee.class, eid);
		Transaction tx=session.beginTransaction();
		session.delete(emp);
		tx.commit();
		System.out.println("deleted");
	}
	
	
	

	
}
