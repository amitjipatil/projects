package equalsmethod;

public class employee {
	private int id;
	private String name;
	
	employee()
	{}
	employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public boolean equals(Object obj)
	{
		
		return super.equals(obj);
	}

}
