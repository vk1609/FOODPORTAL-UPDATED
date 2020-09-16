package dao;

import java.io.IOException;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Complaintdetails;
import utility.ConnectionManager;
//user complaint registration dao

public class ComplaintREgisterDao {
	@SuppressWarnings("static-access")
	public static void addComplaint(Complaintdetails cd) throws ClassNotFoundException, SQLException, IOException {
	String name = cd.getName();
	String mobilenumber = cd.getMobilenumber();
	String complaint = cd.getComplaint();
	
		
		 ConnectionManager cm = new ConnectionManager();
		String sql = "INSERT INTO FOOD_PORTAL_COMPLAINT(NAME, MOBILENUMBER, COMPLAINT)VALUES(?,?,?)";
		PreparedStatement st = cm.getConnection().prepareStatement(sql);
		st.setString(1,name );
		st.setString(2, mobilenumber);
		st.setString(3,complaint);
		int temp =st.executeUpdate();
		if (temp>0) {
			System.out.println("sucessfull");
		}else {
			System.out.println("error occured");
		}
	cm.getConnection().close();
	
	
	}

}
