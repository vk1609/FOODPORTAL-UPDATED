package controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.UserDetailsDao;
import model.UserDetails;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
	

				System.out.println("\t\t1. NEW USER ");
				System.out.println("\t\t2. EXISTING USER");
				System.out.println("\t\t3. LOGIN AS ADMIN");
				int x;
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				x = Integer.parseInt(br.readLine());
				ExistingUser eu =new ExistingUser();
				
				
				//UserDetails ud = new UserDetails(null, null, null, null, null);
				//UserDetailsDao uddao = new UserDetailsDao();
			
				switch(x)
				{
				case 1:
					System.out.println("ENTER YOUR NAME: ");
					String username = br.readLine();
					System.out.println("ENTER YOUR CITY: ");
					String city = br.readLine();
					System.out.println("ENTER YOUR GENDER MALE OR FEMALE");
					String gender = br.readLine();
					System.out.println("ENTER YOUR EMAIL :");
					String email = br.readLine();
					System.out.println("ENTER YOUR MOBILE NUMBER:");
					String mobilenumber = br.readLine();
					
					UserDetails userdetails =new UserDetails(username,city,gender,email,mobilenumber);
					UserDetailsDao.addUser(userdetails);
					System.out.println("\tWELCOME TO THE FOOD PORTAL"+"    "+username);
					
					eu.loging();
					
									break;
				case 2:
					
					eu.loging();
					
					

					break;
				case 3:
					Admin a= new Admin();
					a.al();
				
				
					break;
				
				}
			}

	
}
