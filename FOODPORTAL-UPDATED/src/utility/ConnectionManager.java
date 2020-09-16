package utility;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager{
	
	public static Properties loadPropertiesFile() throws IOException {
	Properties prop = new Properties();
	InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
	prop.load(in);
	in.close();
	return prop;
	}
	
	 public static Connection getConnection() throws IOException, ClassNotFoundException {
		 Properties newprop = new Properties();
		 newprop=loadPropertiesFile();
		 Connection con=null;
		 String driver=newprop.getProperty("driver");
		 String url=newprop.getProperty("url");
		 String username=newprop.getProperty("username");
		 String password=newprop.getProperty("password");
		 try {
			 Class.forName(driver);
			 con=DriverManager.getConnection(url,username,password);
			 if(con!=null) {
				 System.out.println("HERE WE GO");
				 return con;
			 }
		 }
		 catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 return con;
	 }
}
