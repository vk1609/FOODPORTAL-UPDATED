package utility;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;



public class Products {
	public void pro() throws ClassNotFoundException, IOException, SQLException {
		System.out.println("WELCOMETO PRODUCTS SECTION");
    	System.out.println("OUR PRODUCTS ARE");
    	System.out.println("1. MILK");
    	System.out.println("2. BREAD");
    	System.out.println("3. POULTARY");
    	System.out.println("4.GO BACK");
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    	int option_products;

    	do {
    		//products menu switching
    	    System.out.println("Enter \"1\", \"2\" , \"3\" OR \"4\"");
    	    option_products = sc.nextInt();
    	    ExpirayDate ed = new ExpirayDate();

    	    switch (option_products)
    	    {
    	        case 1:
    	        	System.out.println("YOU HAVE ENTERED MILK");
    	        	System.out.println("YOU WILL GET THE INFORMATION ABOUT MILK LIKE INGREDIENTS");
    	        	System.out.println("PLEASE CHECK THE MANUFATURED DATE");
    	        	
    	        	ed.milkman();
    	        	break;
    	        case 2:
    	        	System.out.println("YOU HAVE ENTERED BREAD");
    	        	System.out.println("YOU WILL GET THE INFORMATION ABOUT BREAD LIKE INGREDIENTS");
    	        	System.out.println("PLEASE CHECK THE MANUFATURED DATE");
    	        	ed.breadman();
    	        	break;
    	        case 3: 
    	        	System.out.println("YOU HAVE ENTERED POULTARY");
    	        	System.out.println("YOU WILL GET THE INFORMATION ABOUT POULTARY LIKE INGREDIENTS");
    	        	System.out.println("PLEASE CHECK THE MANUFATURED DATE");
    	        	ed.poulman();
    	        case 4: 
    	        	NavigationMenu mn = new NavigationMenu();
    	    		mn.menu();
    	           
    	            break;
    	        default:
    	            System.out.println("Choice must be a value between 1 and 4.");
    	    }   
    	} while (option_products != 4);
     
		
	}


}
