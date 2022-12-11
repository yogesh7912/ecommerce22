package com.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProduct
{
	Connection con =null;
    public Connection getConnectionDetails() throws SQLException
    {
    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/ecommerce";
		String userName= "root";
		String password="Sakshi@123";
		con=DriverManager.getConnection(url,userName,password);
		
		}
          
        catch (ClassNotFoundException e) 
    {
		
		e.printStackTrace();
	}
    	
   return con;
    	
    	}
}
