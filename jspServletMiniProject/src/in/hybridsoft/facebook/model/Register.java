package in.hybridsoft.facebook.model;

public class Register {
	private String name;
	private String mob;
	private String fname;
	private String lname;
	private String mailid;
	private String password;
	private String sex;
	public Register(String name, String mob, String fname, String lname,
			String mailid, String password, String sex) {
		super();
		this.name = name;
		this.mob = mob;
		this.fname = fname;
		this.lname = lname;
		this.mailid = mailid;
		this.password = password;
		this.sex = sex;
	}
	public Register()
	{}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	

}
