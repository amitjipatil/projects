package emp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author amit patil
 *
 */
public class EmpClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tx = ses.beginTransaction();

		Department department = new Department();
		department.setId(10);
		department.setDeptname("maintainance");

		Employee e = new Employee();
		e.setEid(303);
		e.setName("amit");
		e.setSalary(400);
		e.setDepartment(department);

		Employee e2 = new Employee();
		e2.setEid(304);
		e2.setName("ashutosh");
		e2.setSalary(216);
		e2.setDepartment(department);

		Set<Employee> emp = new HashSet<Employee>();
		emp.add(e2);
		emp.add(e);

		department.setEmp1(emp);

		ses.save(department);

		System.out.println("data save");

		// e.setEid(102);
		// e.setEname("patil");
		// e.setEadd("solapur");

		// ses.load(e,102);
		// System.out.println(e.getEid()+"  "+e.getEname()+"  "+e.getEadd());
		// System.out.println("enter dept name to see the employees");
		// String nm=sc.next();

		/*
		 * Criteria cr=ses.createCriteria(Department.class);
		 * cr.add(Restrictions.eq("name",nm)); List<Employee> el=cr.list(); int
		 * ct1=el.size(); if(ct1==0) { System.out.println("Record not found"); }
		 * else { for (Employee emp : el) {
		 * 
		 * System.out.println(emp.getEid()+" "+emp.getName()+" "+emp.getSalary()+
		 * " "+emp.getDepartment());
		 * 
		 * } }
		 */
		tx.commit();
		ses.close();
		factory.close();

	}

}
