package serialisation;

public class Employee implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	public void check()
	{
		System.out.println("name= "+name+"id= "+id);
		
	}
	
	

}
