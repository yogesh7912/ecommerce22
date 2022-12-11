package com.ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisteredUser 
{
	public static boolean insertUserToDatabase(User user)
	{
		Connection con =null;
		boolean f= false;
		
		try {
		ConnectionProduct cop = new ConnectionProduct();
		con= cop.getConnectionDetails();
		String s ="insert into user(userFirstName , userLastName,userPhoneNumber,userMail)value(?,?,?,?)";
		
		//using preparedStatement
		PreparedStatement ps =con.prepareStatement(s);
		ps.setString(1, user.getUserFirstName());
		ps.setString(2, user.getUserFirstName());
		ps.setLong(3, user.getUserPhoneNumber());
		ps.setString(4, user.getUserMail());
		
		ps.executeUpdate();
		f=true;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return f;
			}
}

