package dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.DelPojo;
import utility.ConnectionManager;

public class DcrDao {
	public static void deleteCrRestaurant(DelPojo dp) throws ClassNotFoundException, SQLException, IOException {
		String rank= dp.getRank();		
    	//delete the details from database
		String sql = "DELETE FROM CERTIFIED_RESTAURANTS WHERE RANK = ?";
		//create statement object
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		st.setString(1, rank);
		int temp =st.executeUpdate();
		if (temp>0) {
			System.out.println("sucessfull");
		}else {
			System.out.println("error occured");
		}
	}
	public static void deleteCrMarket(DelPojo dp) throws ClassNotFoundException, SQLException, IOException {
		String rank= dp.getRank();		
    	//delete the details from database
		String sql = "DELETE FROM CERTIFIED_MARKETS WHERE RANK = ?";
		//create statement object
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		st.setString(1, rank);
		int temp =st.executeUpdate();
		if (temp>0) {
			System.out.println("sucessfull");
		}else {
			System.out.println("error occured");
		}
	}

}
