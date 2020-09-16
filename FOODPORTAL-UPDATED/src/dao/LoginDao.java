package dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Login;
import utility.ConnectionManager;


public class LoginDao {
	@SuppressWarnings("static-access")
	public static boolean validate(Login lg) throws ClassNotFoundException, SQLException, IOException {
		String Username = lg.getUsername();
		String MobileNumber = lg.getMobilenumber();
		ConnectionManager con = new ConnectionManager();
			Statement st  = con.getConnection().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM FOOD_PORTAL");
			while(rs.next()) {
				if(Username.equals(rs.getString(1)) && MobileNumber.equals(rs.getString(5))){
					con.getConnection().close();
					
					return true;
				
				}
				
			}
		
			
			return false;
		}


	

}
