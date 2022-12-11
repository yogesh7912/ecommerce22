package com.ecommerce;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) throws SQLException, IOException 
	{
		System.out.println("Welocme to our E-commerce Website -> ");
	Scanner sc = new Scanner(System.in);
	System.out.println("Press 1 For Registration -> ");
	System.out.println("Press 2 For Exit App -> ");
	int a=sc.nextInt();

	if (a==1)
	{
		System.out.println("Enter Your First Name -> ");
		String FirstName =sc.next();
		System.out.println("Enter Your Last Name -> ");
		String LastName =sc.next();
		System.out.println("Enter Your Phone Number -> ");
		long PhoneNumber = sc.nextLong();
		System.out.println("Enter Your Email -> ");
		String Email = sc.next();
		
		User user = new User(FirstName , LastName, PhoneNumber, Email);
		boolean answer =RegisteredUser.insertUserToDatabase(user);
		if(answer)
		{
			System.out.println("User Registration Has Been Succesfull -> ");
		}
		else
		{
			System.out.println("Something went Wrong -> ");
		}
		System.out.println("Thanku For Registration, You can now Proceed -> ");
		System.out.println(".......................................................");
		System.out.println("This Is Available product List in store ");
		ProductStore pos = new ProductStore();
		pos.getProductDetails();
		
	}
	
	
	

	}

}
