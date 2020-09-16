package utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.DcrDao;
import dao.DncerDao;
import model.DelPojo;

public class Deletion {
	//DELETE OPERATION FOR CERTIFIED RESTAURANTS
	public void deleteCrRestaurant() throws IOException, ClassNotFoundException, SQLException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter Your rank");
		String rank = br.readLine();
		DelPojo dp =new DelPojo( rank);
		DcrDao.deleteCrRestaurant(dp);
		System.out.println("\t\t Deleted Successfully");
	}
	//DELETE OPERATION FOR NON CERTIFIED RESTAURANTS
	public void deleteNcrRestaurant() throws IOException, ClassNotFoundException, SQLException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter Your rank");
		String rank = br.readLine();
		DelPojo dp=new DelPojo( rank);
		DncerDao.deleteNcRestaurant(dp);
		System.out.println("\t\t Deleted Successfully");
	}
	public void deleteCrMarket() throws IOException, ClassNotFoundException, SQLException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter Your rank");
		String rank = br.readLine();
		DelPojo dp =new DelPojo( rank);
		DcrDao.deleteCrMarket(dp);
		System.out.println("\t\t Deleted Successfully");
	}
	public void deleteNcrMarket() throws IOException, ClassNotFoundException, SQLException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter Your rank");
		String rank = br.readLine();
		DelPojo dp =new DelPojo( rank);
		DncerDao.deleteNcMarket(dp);
		System.out.println("\t\t Deleted Successfully");
	}
	
	

}
