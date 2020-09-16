package utility;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;



public class ExpirayDate {
public void milkman() throws ClassNotFoundException, IOException, SQLException {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	       System.out.println("\tEnter the date of Manf [dd/mm/yyy] :");
	       String[] arr;
	       String dom = sc.nextLine();
	       arr=dom.split("/");
	       int d = Integer.parseInt(arr[0]);
	       int m = Integer.parseInt(arr[1]);
	       int y = Integer.parseInt(arr[2]);
	       LocalDate d1 = LocalDate.of(y,m,d); //
	       LocalDate d2 = LocalDate.now();
	       Period p = Period.between(d1,d2);
	       System.out.println( "Number of days" + p.getDays() );
	       System.out.println("Number of months" +  p.getMonths() );
	       System.out.println("Number of years" + p.getYears());
	    		   if(p.getDays() <10 && p.getMonths()<1) 
	    		   {
	    			   System.out.println("\t OK ! you can buy");
	    		   }
	    		   else
	    		   {
	    			   System.out.println(" Expired! you can't buy");
	    		   }
	    		   System.out.println("Milk powders. Depending on the type of milk used, drying produces whole milk or skimmed milk powder. ...");
	    		   System.out.println("Dried and demineralized whey. Whey is obtained during cheese manufacturing after coagulation and slicing of the curds. ...");
	    		   System.out.println("Lactose. ...");
	    		   System.out.println("Caseins and caseinates. ...");
	    		   System.out.println(" WPCs and WPIs. ...");
	    		   System.out.println("MPCs and MPIs");
	    		   Products pr = new Products();
	            	pr.pro();
	    		   
			}
public void breadman() throws ClassNotFoundException, IOException, SQLException {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	       System.out.println("\tEnter the date of Manf [dd/mm/yyy] :");
	       String[] arr;
	       String dom = sc.nextLine();
	       arr=dom.split("/");
	       int d = Integer.parseInt(arr[0]);
	       int m = Integer.parseInt(arr[1]);
	       int y = Integer.parseInt(arr[2]);
	       LocalDate d1 = LocalDate.of(y,m,d); //
	       LocalDate d2 = LocalDate.now();
	       Period p = Period.between(d1,d2);
	       System.out.println( "Number of days" + p.getDays() );
	       System.out.println("Number of months" +  p.getMonths() );
	       System.out.println("Number of years" + p.getYears());
	    		   if(p.getDays() <5 && p.getMonths()<1) 
	    		   {
	    			   System.out.println(" OK ! you can buy");
	    		   }
	    		   else
	    		   {
	    			   System.out.println(" Expired! you can't buy");
	    		   }
	    		   System.out.println("Yeast. Yeast is the heart of the bread-making process. ...\r\n" +
	    		   		"Flour. Wheat is the most common type of flour used in bread baking. ...\r\n" +
	    		   		"Liquids. Water. ...\r\n" + 
	    		   		"Sweetener. Sugar adds flavor and rich brown color to a bread's crust. ...\r\n" + 
	    		   		"Salt. ...\r\n" + 
	    		   		"Eggs. ...\r\n" + 
	    		   		"Fat.");
	    		   Products pr = new Products();
	            	pr.pro();
	    		   
			}
public void poulman() throws ClassNotFoundException, IOException, SQLException {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
       System.out.println("\tEnter the date of Manf [dd/mm/yyy] :");
       String[] arr;
       String dom = sc.nextLine();
       arr=dom.split("/");
       int d = Integer.parseInt(arr[0]);
       int m = Integer.parseInt(arr[1]);
       int y = Integer.parseInt(arr[2]);
       LocalDate d1 = LocalDate.of(y,m,d); //
       LocalDate d2 = LocalDate.now();
       Period p = Period.between(d1,d2);
       System.out.println( "Number of days" + p.getDays() );
       System.out.println("Number of months" +  p.getMonths() );
       System.out.println("Number of years" + p.getYears());
    		   if(p.getDays() <12 && p.getMonths()<1) 
    		   {
    			   System.out.println(" OK ! you can buy");
    		   }
    		   else
    		   {
    			   System.out.println(" Expired! you can't buy");
    		   }
    		   System.out.println("CHICKEN");
    		   System.out.println("MUTTON");
               System.out.println("BEEF");
               Products pr = new Products();
           	pr.pro();

    		   
    		   
		}


	}


