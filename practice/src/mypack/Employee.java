package mypack;

public class Employee {
int eno;
String ename;
String address;
int salary;
Employee()
{}
Employee(int eno,String ename,String address, int salary)
{
	this.ename = ename;
	this.eno=eno;
	this.address=address;
	this.salary=salary;
	}


	

@Override
public String toString() {
	return "Employee [eno=" + eno + ", ename=" + ename + ", address=" + address
			+ ", salary=" + salary + "]";
}
/*public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

*/
}
