package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import adminOperation.MarmenuAd;
import adminOperation.ResMenuAd;
import dao.InfoAboutUsersDao;

public class Admin {
	@SuppressWarnings("resource")
	public void al() throws ClassNotFoundException, SQLException, IOException {
		//admin login
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO THE ADMIN LOGIN");
		System.out.println("ENTER YOUR USER ID FOR LOGIN : ");
		String userid = sc.nextLine();
		System.out.println("ENTER YOUR PASSWORD :");
		String password = sc.nextLine();
		if("Admin".equals(userid) && "admin@123".equals(password)) {
			//after login admin me
			System.out.println("\t WELCOME TO FOOD PORTAL ADMIN");
			System.out.println("PRESS 1 \n FOR THE TOTAL LIST OF USER'S CHECKED OUR PORTAL");
			System.out.println("PRESS 2 \n FOR THE TOTAL LIST OF COMPLANINTS THROUGH PORTAL");
			System.out.println("PRESS 3 \n UPDATIONS IN RESTAURANTS");
			System.out.println("PRESS 4 \n UPDATIONS IN MARKETS");
			
			
			int x;
			InfoAboutUsersDao i = new InfoAboutUsersDao();
			x = sc.nextInt();
			Admin a = new Admin();
			switch(x) {
			case 1:
				System.out.println("HERE IS THE LIST OF USERS");
				i.ias();
				a.al();
				
				break;
			case 2:
				System.out.println("HERE IS THE LIST OF COMPLAINTS");
				i.iac();
				a.al();
				break;
			case 3:
				System.out.println("HERE YOU CAN UPDATE RESTAUTANTS");
				ResMenuAd r = new ResMenuAd();
				r.rma();

				break;
			case 4:
				System.out.println("HERE YOU CAN UPDATE MARKETS");
				MarmenuAd m = new MarmenuAd();
				m.mma();
				break;
			}
			
		}else {
			System.out.println("YOU HAVE ENTERED WRONG CREDENTIALS");
			System.out.println("PLEASE TRY AGAIN");
			Admin a= new Admin();
			a.al();
			
		}
		
	}

}
