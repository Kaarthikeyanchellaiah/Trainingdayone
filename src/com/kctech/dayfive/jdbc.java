package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
	
	
 public static void main(String[] args) throws SQLException, ClassNotFoundException {
	 
	 
	 Class.forName("com.mysql.cj.jdbc.Driver");  
	 
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","rootroot");  
	 
	 Statement stmt=con.createStatement();  
	 
	 ResultSet rs=stmt.executeQuery("select * from customers");  
	 
	 while(rs.next())  
	 {
		 System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t\t"+rs.getString(3)+"\t\t\t"+rs.getString(4)+" \t\t\t"+rs.getString(5));
		 
}
		 con.close(); 


	
}
}
