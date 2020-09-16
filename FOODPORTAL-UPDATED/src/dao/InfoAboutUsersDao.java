package dao;

import java.io.IOException;
//USERDETAILS DAO
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utility.ConnectionManager;

public class InfoAboutUsersDao {
	public void ias() throws ClassNotFoundException, SQLException, IOException {
		String sql = "SELECT * FROM USER_DETAILS";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString(1) +"   "+ rs.getString(2)+"   "+ rs.getString(3) +"   "+ rs.getString(4) +"   "+rs.getString(5));
		}
	}
//USERDETAILS COMPLAINTS REGISTRATION
	public void iac() throws ClassNotFoundException, SQLException, IOException {
		String sql = "SELECT * FROM FOOD_PORTAL_COMPLAINT";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString(1) +"   "+ rs.getString(2)+"   "+ rs.getString(3) );
		}
	}

}
