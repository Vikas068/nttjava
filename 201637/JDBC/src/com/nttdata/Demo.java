package com.nttdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {
	
	public static void main(String[] args) {
		
		
		String url="jdbc:mysql://localhost:8805/emp";
		String username="root";
		String password="root";
		
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			Statement stmt=con.createStatement();
			String sql="select * from employee";
			ResultSet rs=stmt.executeQuery(sql);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
