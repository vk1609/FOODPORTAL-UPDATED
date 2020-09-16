package utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.ComplaintREgisterDao;
import model.Complaintdetails;

public class ComplaintRegister {
	public void cr() throws IOException, ClassNotFoundException, SQLException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	System.out.println("ENTER YOUR NAME: ");
	String name = br.readLine();
	System.out.println("ENTER YOUR MOBILE-NUMBER: ");
	String mobilenumber = br.readLine();
	System.out.println("ENTER YOUR COMPLAINT");
	String complaint = br.readLine();
	
	
	Complaintdetails cd = new Complaintdetails(name, mobilenumber, complaint );
	ComplaintREgisterDao.addComplaint(cd);
	
	}
	
}
