package adminOperation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import controller.Admin;

public class ResMenuAd {
	@SuppressWarnings("resource")
	public void rma() throws ClassNotFoundException, IOException, SQLException {
		System.out.println("HERE YOU CAN UPDATE RESTAUTANTS");
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1. UPDATE CERTIFIED RESTAURANTS ");
		System.out.println(" 2. UPDATE NON-CERTIFIED RESTAURANTS ");
		System.out.println(" 3. DELETE CERTIFIED RESTAURANTS ");
		System.out.println(" 4. DELETE NON-CERTIFIED RESTAURANTS ");
		System.out.println(" 5. ADD CERTIFIED RESTAURANTS ");
		System.out.println(" 6. ADD NON-CERTIFIED RESTAURANTS ");
		System.out.println(" 7. PREVIOUS MENU ");
		AdResMar ar = new AdResMar();
		ResMenuAd m = new ResMenuAd();
		
		
		int x =0;
		
		x = sc.nextInt();
		
		switch(x){
		case 1:
		ar.UpCrRes();
	
		m.rma();
			break;
		case 2:
			ar.UpNcrRes();
			m.rma();
			
			break;
		case 3:
			ar.DelCrRes();
			m.rma();
			break;
		case 4:
			ar.DelNcrRes();
			m.rma();
			break;
		case 5:
			ar.adcrRes();
			m.rma();
			break;
		case 6:
			ar.adcrMar();
			m.rma();
			break;
		case 7 :
			Admin a = new Admin();
			a.al();
			
			break;
		default:
			System.out.println("ENTER THE CORRECTION OPTION");
			
			m.rma();
				
			
		}
	
	}

}
