package dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utility.ConnectionManager;
//certified maerkets dao
public class MarketsDao {
	public void cr() throws ClassNotFoundException, SQLException, IOException {
		try {
		String sql = "SELECT * FROM CERTIFIED_MARKETS";
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
	//non certified maerkets dao
	public void ncr() throws ClassNotFoundException, SQLException, IOException {
		String sql = "SELECT * FROM NON_CERTIFIED_MARKETS";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString(1) +"   "+ rs.getString(2));
		}
	}
	
	

}
