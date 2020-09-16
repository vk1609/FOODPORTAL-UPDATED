package dao;

import java.io.IOException;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Certified;
import utility.ConnectionManager;
//update operation for certified RESTAURANTS

public class CrDao {
	public static void updatecRes(Certified crr) throws ClassNotFoundException, SQLException, IOException{
	String rank = crr.getRank();
	String name = crr.getName();
	try {
		String sql ="UPDATE CERTIFIED_RESTAURANTS SET NAME = ? where RANK = ?";
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		//input for rank and name
		st.setString(1, name);
		st.setString(2, rank);
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
	//update operation for certified markets
	
	public static void updatecMar(Certified crr) throws ClassNotFoundException, SQLException, IOException{
		String rank = crr.getRank();
		String name = crr.getName();
		try {
			String sql ="UPDATE CERTIFIED_MARKETS SET NAME = ? where  RANK= ?";
			PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
			//input for rank and name
			st.setString(1, name);
			st.setString(2, rank);
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
	public static void addCerRes(Certified crr) {
		String rank = crr.getRank();
		String name = crr.getName();
		try {
			String sql ="INSERT INTO CERTIFIED_RESTAURANTS VALUES(?,?)";
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
	public static void addCerMar(Certified crr) {
		String rank = crr.getRank();
		String name = crr.getName();
		try {
			String sql ="INSERT INTO CERTIFIED_MARKETS VALUES(?,?)";
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
