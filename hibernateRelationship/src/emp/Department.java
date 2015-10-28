package emp;
import java.util.HashSet;
import java.util.Set;

public class Department implements java.io.Serializable {

	private Integer id;
	private String deptname;
	private Set employees = new HashSet();
	
	
	private Set<Employee> emp1=new HashSet<Employee>();

	public Set<Employee> getEmp1() {
		return emp1;
	}

	public void setEmp1(Set<Employee> emp1) {
		this.emp1 = emp1;
	}

	public Department() {
	}

	public Department(String deptname) {
		this.deptname = deptname;
	}

	public Department(String deptname, Set employees) {
		this.deptname = deptname;
		this.employees = employees;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

}
