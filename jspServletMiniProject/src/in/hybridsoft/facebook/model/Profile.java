package in.hybridsoft.facebook.model;

public class Profile {
	private int regid;
	private String image_url;
	private String hobby;
	private String intrest;
	private String address;
	private String secondary_email;
	private int pincode;
	public Profile(int regid, String image_url, String hobby, String intrest,
			String address, String secondary_email, int pincode) {
		super();
		this.regid = regid;
		this.image_url = image_url;
		this.hobby = hobby;
		this.intrest = intrest;
		this.address = address;
		this.secondary_email = secondary_email;
		this.pincode = pincode;
	}
	
	public Profile()
	{}
	
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getIntrest() {
		return intrest;
	}
	public void setIntrest(String intrest) {
		this.intrest = intrest;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSecondary_email() {
		return secondary_email;
	}
	public void setSecondary_email(String secondary_email) {
		this.secondary_email = secondary_email;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	

}
