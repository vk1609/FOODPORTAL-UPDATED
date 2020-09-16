package dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.UserDetails;
import utility.ConnectionManager;
//enter the userdetails opretion
public class UserDetailsDao {
	@SuppressWarnings("static-access")
	public static void addUser(UserDetails ud) throws ClassNotFoundException, SQLException, IOException {
		String userName= ud.getUserName();
		 String city= ud.getCity();
		 String email = ud.getEmail();
		 String gender = ud.getGender();
		 String mobilenumber =ud.getMobilenumber();
		
		 ConnectionManager cm = new ConnectionManager();
		String sql = "INSERT INTO USER_DETAILS(USERNAME,CITY,EMAIL,GENDER,MOBILENUMBER)VALUES(?,?,?,?,?)";
		PreparedStatement st = cm.getConnection().prepareStatement(sql);
		
		
		st.setString(1,userName);
		st.setString(2,city);
		st.setString(3,email);
		st.setString(4,gender);
		st.setString(5,mobilenumber);
	int temp =st.executeUpdate();
	if (temp>0) {
		System.out.println("sucessfull");
	}else {
		System.out.println("error occured");
	}
	cm.getConnection().close();
	
	}
}
