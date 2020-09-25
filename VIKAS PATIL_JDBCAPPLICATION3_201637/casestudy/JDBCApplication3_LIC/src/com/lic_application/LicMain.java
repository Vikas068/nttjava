package com.lic_application;

import java.util.*;

public class LicMain {
	static int ch=0,result;
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
	
	try {
		do {
			
			System.out.println("-------Choose below one---------");
			System.out.println("1.Insert Details");
			System.out.println("2.Fetch Details");
			System.out.println("3.Delete Details");
			System.out.println("4.Update details");
			
			System.out.println("Please choose any one opertaion to perform.");
			ch=scan.nextInt();
			switch(ch)
			{
			case 1:
				result=Lic.Insert();
				break;
			case 2:
				Lic.Fetch();
				break;
			case 3:
				Lic.Delete();
			case 4:
				Lic.Update();
			}
			
		}while(ch != 0);
		System.out.println("Wrong selection...");
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
