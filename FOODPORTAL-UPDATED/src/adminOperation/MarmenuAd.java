package adminOperation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import controller.Admin;

public class MarmenuAd {
	@SuppressWarnings("resource")
	public void mma() throws ClassNotFoundException, IOException, SQLException {
		System.out.println("HERE YOU CAN UPDATE RESTAUTANTS");
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1. UPDATE CERTIFIED MARKETS ");
		System.out.println(" 2. UPDATE NON-CERTIFIED MARKETS ");
		System.out.println(" 3. DELETE CERTIFIED MARKETS ");
		System.out.println(" 4. DELETE NON-CERTIFIED MARKETS ");
		System.out.println(" 5. ADD CERTIFIED MARKETS ");
		System.out.println(" 6. ADD NON-CERTIFIED MARKETS ");
		System.out.println(" 7. PREVIOUS MENU ");
		AdResMar ar = new AdResMar();
		MarmenuAd m = new MarmenuAd();
		
		
		int x =0;
		
		x = sc.nextInt();
		
		switch(x){
		case 1:
		ar.UpCrMar();
		m.mma();
			
			break;
		case 2:
			ar.UpNcrMar();
			m.mma();
			
			break;
		case 3:
			ar.DelCrMar();
			m.mma();
			
			break;
		case 4:
			ar.DelNcrMar();
			m.mma();
			
			break;
		case 5:
			ar.adNcrRes();
			m.mma();
			break;
		case 6:
			ar.adNcrMar();
			m.mma();
			break;
		case 7 :
			Admin a = new Admin();
			m.mma();
			a.al();
			
			break;
			default:
				System.out.println("ENTER THE CORRECTION OPTION");
				
				m.mma();
				
				
			
		}
	
	}
	

}
