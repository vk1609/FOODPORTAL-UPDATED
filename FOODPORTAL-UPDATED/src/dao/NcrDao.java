package dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.NonCertified;
import utility.ConnectionManager;

public class NcrDao {
	//update operation for non-certified RESTAURANTS
	public static void updateNcRes(NonCertified ncrr) throws ClassNotFoundException, SQLException, IOException{
		String rank = ncrr.getRank();
		String name = ncrr.getName();
		try {
			String sql ="UPDATE NON_CERTIFIED_RESTAURANTS set NAME = ? where  RANK= ?";
			PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
			st.setString(1, name);
			st.setString(2, rank);
			int temp =st.executeUpdate();
			if (temp>0) {
				System.out.println("sucessfull");
			}else {
				System.out.println("error occured");
			}
		}catch (Exception e) {
			System.out.println(e);

	}
	}
	//update operation for non-certified markets
	
	public static void updateNcMar(NonCertified ncrr) throws ClassNotFoundException, SQLException, IOException{
		String rank = ncrr.getRank();
		String name = ncrr.getName();
		try {
			String sql ="UPDATE NON_CERTIFIED_MARKETS set NAME = ? where  RANK= ?";
			PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
			st.setString(1, name);
			st.setString(2, rank);
			int temp =st.executeUpdate();
			if (temp>0) {
				System.out.println("sucessfull");
			}else {
				System.out.println("error occured");
			}
		}catch (Exception e) {
			System.out.println(e);

	}
	}
	//ADD NEW NONCERTIFIED MARKET
	public static void addNcrMar(NonCertified ncrr) {
		String rank = ncrr.getRank();
		String name = ncrr.getName();
		try {
			String sql ="INSERT INTO NON_CERTIFIED_MARKETS VALUES(?,?)";
			PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
			//input for rank and name
			st.setString(1, rank);
			st.setString(2, name);
			
			int temp =st.executeUpdate();
			if (temp>0) {
				System.out.println("sucessfull");
			}else {
				System.out.println("error occured");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		
	}
	}
	//ADD NEW NONCERTIFIED RESTAURANT
	public static void addNcrRes(NonCertified ncrr) {
		String rank = ncrr.getRank();
		String name = ncrr.getName();
		try {
			String sql ="INSERT INTO NON_CERTIFIED_MARKETS VALUES(?,?)";
			PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
			//input for rank and name
			st.setString(1, rank);
			st.setString(2, name);
			
			int temp =st.executeUpdate();
			if (temp>0) {
				System.out.println("sucessfull");
			}else {
				System.out.println("error occured");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		
	}
	}

}
