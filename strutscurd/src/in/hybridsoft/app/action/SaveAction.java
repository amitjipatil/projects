package in.hybridsoft.app.action;

import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.sql.Alias;

import in.hybridsoft.app.model.Employee;
import in.hybridsoft.app.service.EmployeeServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author amit
 *
 */
public class SaveAction extends ActionSupport {

	Employee employee;

	ArrayList alList = new ArrayList();

	public ArrayList getAlList() {
		return alList;
	}

	public void setAlList(ArrayList alList) {
		this.alList = alList;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	EmployeeServiceImpl emServiceImpl = new EmployeeServiceImpl();

	public String saveData() {

		System.out.println(employee.getEid());
		System.out.println(employee.getEname());
		System.out.println(employee.getSalary());
		emServiceImpl.savedata(employee);
		return "success";
	}

	public String getData() {
		alList = (ArrayList) emServiceImpl.getdata();
		return "success";
	}

	public String deleteData() {
		emServiceImpl.deletData(employee.getEid());

		return "success";
	}

	public String updateData() {
		System.out.println("in update" + employee.getEid());
		return "success";
	}

}
