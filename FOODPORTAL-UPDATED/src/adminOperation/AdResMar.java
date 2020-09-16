package adminOperation;

import java.io.IOException;
import java.sql.SQLException;
import utility.Deletion;
import utility.Updation;

public class AdResMar {
	Updation u = new Updation();
	Deletion d = new Deletion();
	public void UpCrRes() throws ClassNotFoundException, IOException, SQLException {
		u.updateCrres();
		
	}
	public void UpNcrRes() throws ClassNotFoundException, IOException, SQLException {
		u.updateNcres();
		
	}
	public void DelCrRes() throws ClassNotFoundException, IOException, SQLException {
		
		d.deleteCrRestaurant();
		
	}
	public void DelNcrRes() throws ClassNotFoundException, IOException, SQLException {
		d.deleteNcrRestaurant();
		
	}
	public void UpCrMar() throws ClassNotFoundException, IOException, SQLException {
		u.updateCrMar();
		
	}
    public void UpNcrMar() throws ClassNotFoundException, IOException, SQLException {
    	u.updateNcMar();
		
	}
    public void DelCrMar() throws ClassNotFoundException, IOException, SQLException {
    	d.deleteCrMarket();
	
    }
     public void DelNcrMar() throws ClassNotFoundException, IOException, SQLException {
    	 d.deleteNcrMarket();
	
    }
     public void adcrRes() throws IOException {
    	 u.addCerRes();
     }
     public void adcrMar() throws IOException {
    	 u.addCerMar();
     }
     public void adNcrRes() throws IOException {
    	 u.addNcrRes();
     }
     public void adNcrMar() throws IOException {
    	 u.addNcrMar();
     }
     
	
}
