package utility;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;



public class NavigationMenu {
	public void menu() throws ClassNotFoundException, IOException, SQLException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("HERE IS THE MENU FOR YOU");
		System.out.println("1.PRODUCTS");
	    System.out.println("2.RESTAURENTS");
	    System.out.println("3.MARKETS");
	    System.out.println("4.DIET ANALYSIS");
	    System.out.println("5.REGISTER COMPLAINT");
		NavigationMenu nm = new NavigationMenu();
	    
	    int option;

	    do {
	        System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");
	        option = sc.nextInt();

	        switch (option)
	        {
	            case 1:
	            	Products p = new Products();
	            	p.pro();
	            	nm.menu();
	            	
	            	break;
	            case 2: 
	            	Restaurants r = new Restaurants();
	            	r.res();
	            	nm.menu();
	                break;
	            case 3: 
	            	Markets m = new Markets();
	            	m.mar();
	            	nm.menu();
	                break;
	            case 4 :
	            	DietAnalysis da = new DietAnalysis();
	            	da.das();
	            	nm.menu();
	            	break;
	            case 5 :
	            	ComplaintRegister crt = new ComplaintRegister();
	            	crt.cr();
	            	
	            
	            	nm.menu();
	            default:
	                System.out.println("Choice must be a value between 1 and 5.");
	        }   
	    } while (option != 5);
		
	}
	
}
