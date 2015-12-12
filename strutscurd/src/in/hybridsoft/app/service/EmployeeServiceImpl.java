package in.hybridsoft.app.service;

import java.util.List;

import in.hybridsoft.app.dao.Daoimpl;
import in.hybridsoft.app.model.Employee;

public class EmployeeServiceImpl {
	Daoimpl daoimpl=new Daoimpl();
	public void savedata(Employee employee)
	{
		
		daoimpl.savedata(employee);
	}
	
	public List getdata()
	{
		List list = daoimpl.getdata();
		return list;
	}

	public void deletData(int eid)
	{
		daoimpl.deletData(eid);
	}
}
