package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.LoginDao;
import model.Login;
import utility.NavigationMenu;

public class ExistingUser {
	public void loging() throws IOException, ClassNotFoundException, SQLException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER YOUR NAME: ");
		String username = br.readLine();
		System.out.println("ENTER YOUR MOBILENUMBER: ");
		String mobilenumber = br.readLine();
		Login lg = new Login(username, mobilenumber);
		if(LoginDao.validate(lg)==true) {
			
		System.out.println("\tWELCOME TO THE FOOD PORTAL"+"    "+username);
		NavigationMenu nm = new NavigationMenu();
		nm.menu();
		}
		else {
			System.out.println("enter the correct credentials");
			ExistingUser e = new ExistingUser();
			e.loging();
		}
		
		
		
	}

}
