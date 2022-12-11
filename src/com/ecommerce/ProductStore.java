package com.ecommerce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductStore 
{
	Connection con = null;
	PreparedStatement ps = null;
public void getProductDetails() throws SQLException
{
	Scanner sc = new Scanner(System.in);
	ConnectionProduct cop = new ConnectionProduct();
	cop.getConnectionDetails();
	try {
		ps=con.prepareStatement("select product_id,product_name from product order by 1");
		ResultSet set  =ps.executeQuery();
		while (set.next())
		{
			System.out.println(set.getInt(1));
			System.out.println(set.getString(2));
		}
	}
		
	catch (SQLException e) 
	{
		
		e.printStackTrace();
	}
}
		 	
}

