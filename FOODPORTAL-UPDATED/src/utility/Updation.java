package utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import dao.CrDao;
import dao.NcrDao;
import model.Certified;

import model.NonCertified;

public class Updation{
	//UPDATE THE CERTIFIED restaurants
	public void updateCrres() throws IOException, ClassNotFoundException, SQLException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE RANK ");
		String rank = br.readLine();
		System.out.println("ENTER THE NAME OF RESTAURANT TO UPDATE");
		String name = br.readLine();
		Certified Crr =new Certified(rank,name);
		CrDao.updatecRes(Crr);
		}
	//UPDATE THE non_CERTIFIED restaurants
	public void updateNcres() throws IOException, ClassNotFoundException, SQLException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE RANK ");
		String rank = br.readLine();
		System.out.println("ENTER THE NAME OF RESTAURANT TO UPDATE");
		String name = br.readLine();
		NonCertified ncrr =new NonCertified(rank,name);
		NcrDao.updateNcRes(ncrr);
		}
	//UPDATE THE CERTIFIED MARKETS
	public void updateCrMar() throws IOException, ClassNotFoundException, SQLException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE RANK ");
		String rank = br.readLine();
		System.out.println("ENTER THE NAME OF MARKET TO UPDATE");
		String name = br.readLine();
		Certified Crr =new Certified(rank,name);
		CrDao.updatecMar(Crr);
		}
	//UPDATE THE NON-CERTIFIED MARKETS
	public void updateNcMar() throws IOException, ClassNotFoundException, SQLException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE RANK ");
		String rank = br.readLine();
		System.out.println("ENTER THE NAME OF MARKET TO UPDATE");
		String name = br.readLine();
		NonCertified ncrr =new NonCertified(rank,name);
		NcrDao.updateNcMar(ncrr);
		}
	//ADD THE CERTIFIED RESTAURANTS
    public void addCerRes() throws IOException {
    	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE RANK ");
		String rank = br.readLine();
		System.out.println("ENTER THE NAME OF RESTAURANT TO ADD ");
		String name = br.readLine();
		Certified Crr =new Certified(rank,name);
		CrDao.addCerRes(Crr);
    }
    //ADD THE CERTIFIED MARKETS
    public void addCerMar() throws IOException {
    	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE RANK ");
		String rank = br.readLine();
		System.out.println("ENTER THE NAME OF MARKET TO ADD ");
		String name = br.readLine();
		Certified Crr =new Certified(rank,name);
		CrDao.addCerRes(Crr);
    }
    //ADD THE NON CERTIFIED RESTAUARNTS
    public void addNcrRes() throws IOException {
    	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE RANK ");
		String rank = br.readLine();
		System.out.println("ENTER THE NAME OF RESTAURANTS TO ADD ");
		String name = br.readLine();
		NonCertified ncrr = new NonCertified(rank,name);
		NcrDao.addNcrRes(ncrr);
		
    	
    }
  //ADD THE NON CERTIFIED MARKETS
    public void addNcrMar() throws IOException {
    	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE RANK ");
		String rank = br.readLine();
		System.out.println("ENTER THE NAME OF MARKET TO ADD ");
		String name = br.readLine();
		NonCertified ncrr = new NonCertified(rank,name);
		NcrDao.addNcrMar(ncrr);
		
		
    }
    	
		
		
	}


