package model;
//login parameters
public class Login {
	private String username;
	private String mobilenumber;
	
	public Login(String username, String mobilenumber) {
		super();
		this.username = username;
		this.mobilenumber = mobilenumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	
}
	


