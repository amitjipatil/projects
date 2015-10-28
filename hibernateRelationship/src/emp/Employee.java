package emp;
public class Employee implements java.io.Serializable {

	private Integer eid;
	private Department department;
	private String name;
	private int salary;

	public Employee() {
	}

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public Employee(Department department, String name, int salary) {
		this.department = department;
		this.name = name;
		this.salary = salary;
	}

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
