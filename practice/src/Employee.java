
public class Employee implements Comparable{

    int age;
    String name;
    int salary;
    Employee( int age,String name,int salary)
    {
    	this.age=age;
    	this.name=name;
    	this.salary=salary;
    }
@Override
public int compareTo(Object o) {
	
	return 0;
	
}
/*@Override
public String toString() {
// TODO Auto-generated method stub
return "emp-"+age+name+salary;
}*/


}
