package com.nttdata;

public class Exception1 {
	
	    public static void main(String[] args)
	    {
	        try
	        {
	            Class.forName("com.mysql.Jdbc.Driver");
	        }catch (ClassNotFoundException e)
	        {
	            e.printStackTrace();
	        }
	    }
	}

