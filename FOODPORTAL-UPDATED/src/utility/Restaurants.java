package utility;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import dao.RestaurantsDao;



public class Restaurants {
	public void res() throws ClassNotFoundException, IOException, SQLException {
		int option;
		
		
		do {
			System.out.println("Enter your option");
			 System.out.println("1. CERTIFIED");
			 System.out.println("2. NON-CERTIFIED");
			 System.out.println("3. GO BACK");
	        System.out.println("Enter \"1\",\"3\" or \"2\"");
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        RestaurantsDao rd = new RestaurantsDao();
	        
	        
	        option = sc.nextInt();

	        switch (option)
	        {
	            case 1:
	            rd.cr();
	            	
	            	break;
	            case 2: 
	            rd.ncr();
	                break;
	            case 3:
	            	NavigationMenu mn = new NavigationMenu();
	        		mn.menu();
	            default:
	                System.out.println("Choice must be a value between 1 and 3.");
	        }   
	    } while (option != 3);
		
		
	}
}
