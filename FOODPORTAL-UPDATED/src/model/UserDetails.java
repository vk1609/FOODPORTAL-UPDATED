package model;
//userdetails parameters
public class UserDetails {
	private String userName;
	private String city;
	private String email;
	private String gender;
	private String mobilenumber;
	
	//constructor using feilds
	public UserDetails(String userName, String city, String email, String gender, String mobilenumber) {
		super();
		this.userName = userName;
		this.city = city;
		this.email = email;
		this.gender = gender;
		this.mobilenumber = mobilenumber;
	}
	//getters and setters
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	
	
}

	

	


