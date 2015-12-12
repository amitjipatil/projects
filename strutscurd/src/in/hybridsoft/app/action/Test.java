package in.hybridsoft.app.action;

import in.hybridsoft.app.service.EmployeeServiceImpl;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
 // temprary class not usefull
public class Test extends ActionSupport{

	EmployeeServiceImpl emServiceImpl=new EmployeeServiceImpl();
	@Override
	public String execute() throws Exception {
		System.out.println("hi");
		//emServiceImpl.savedata();
		return "success";
	}

}
