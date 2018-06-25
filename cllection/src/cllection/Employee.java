package cllection;

public class Employee implements Comparable{

	int id;
	String name;
	public Employee(int id,String name) {
	this.id=id;
	this.name=name;
	}
	@Override
	public String toString() {
			return "emp-"+id+" "+name;
	}
	@Override
	public int compareTo(Object o) {
		Employee e1=(Employee)o;
		int eid=e1.id;
		String ename=e1.name;
		if(id<eid)
		{
			return -1;
		}
		else if(id>eid)
		return 1;
		else if(id==eid)
		{
			return name.compareTo(ename);
		}
		else
		return 0;
	}

}
