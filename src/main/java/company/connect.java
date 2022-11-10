package company;

import java.sql.DriverManager;

public class connect {

	public static void main(String[] args) {
		final String url="jdbc:mysql://localhost/project";
		   final String user="root";
		   final String pass="Arpita";

	      try {
	         System.out.println("Connecting to database..............."+url);
	         DriverManager.getConnection(url, user, pass);
	         System.out.println("Connection is successful!!!!!!");
	      }
	      catch(Exception e) {
	         e.printStackTrace();
	      }
	   }

	}


