package utility;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import dao.MarketsDao;
public class Markets {
	public void mar() throws ClassNotFoundException, IOException, SQLException {
		int option;
		
		
		do {
			//menu for markets 
			 System.out.println("Enter your option");
			 System.out.println("1. CERTIFIED");
			 System.out.println("2. NON-CERTIFIED");
			 System.out.println("3. GO BACK");
	        System.out.println("Enter \"1\", \"3\" or \"2\"");
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        MarketsDao md = new MarketsDao();
	        
	        option = sc.nextInt();

	        switch (option)
	        {
	            case 1:
	            	md.cr();
	            	
	            	
	            	break;
	            case 2: 
	            	md.ncr();
	            	
	            	
	            	;
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
