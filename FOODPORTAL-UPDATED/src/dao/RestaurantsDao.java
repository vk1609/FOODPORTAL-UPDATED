package dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utility.ConnectionManager;
//certified markets restaurants (display operation)
public class RestaurantsDao {
	public void cr() throws ClassNotFoundException, SQLException, IOException {
		try {
		String sql = "SELECT * FROM CERTIFIED_RESTAURANTS";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString(1) +"   "+ rs.getString(2));
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	//non-certified markets restaurants (display operation)
	public void ncr() throws ClassNotFoundException, SQLException, IOException {
		String sql = "SELECT * FROM NON_CERTIFIED_RESTAURANTS";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString(1) +"   "+ rs.getString(2));
		}
	}
	
}
