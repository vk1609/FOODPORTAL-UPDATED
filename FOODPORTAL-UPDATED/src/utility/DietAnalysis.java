package utility;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;


public class DietAnalysis {
	@SuppressWarnings("resource")
	public void das() throws ClassNotFoundException, IOException, SQLException {
		
		 Scanner input = new Scanner(System.in);

	        double weight;
	        int feet;
	        int inches;

	        System.out.print("\tEnter weight in kilo: ");
	        weight = input.nextFloat();

	        System.out.print("\tEnter feet: ");
	        feet = input.nextInt();

	        System.out.print("\tEnter inches: ");
	        inches = input.nextInt();


	       
	        double heightInMeters = (((feet * 12) + inches) * .0254);
	        double bmi = weight / Math.pow(heightInMeters, 2.0);
	        System.out.println("\tYour BMI is: " + bmi);

	      
	        if (bmi < 18.5 ) {
	            System.out.println("\tUnderweight");
	            System.out.println("\tyou have to eat more dude!!!");
	        }

	        else if (bmi >= 18.5 && bmi < 25) {
	            System.out.println("\tNormal");
	            System.out.println("\tyour diet was good dude!!");
	        }

	        else if (bmi >= 25 && bmi < 30) {
	            System.out.println("\tOverweight");
	            System.out.println("\tControl your diet dude!!");
	        }

	        else if (bmi >= 30) {
	            System.out.println("\tObese");
	            System.out.println("\tDUDE!!!! STOP EATING AND DO EXERCISE");
	        }
	        NavigationMenu mn = new NavigationMenu();
			mn.menu();

	       

	}

}
