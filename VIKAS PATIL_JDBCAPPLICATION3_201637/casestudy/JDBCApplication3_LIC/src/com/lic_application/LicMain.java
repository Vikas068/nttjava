package com.lic_application;

import java.util.*;

public class LicMain {
	static int ch=0,result;
	//Setting th scanner for input operation.
	static Scanner scan=new Scanner(System.in);
	//Main method.
	public static void main(String[] args) {
		
	//try/catch clause.
	try {
		do {
			//Operations to be performed.
			System.out.println("-------Choose below one---------");
			System.out.println("1.Insert Details");
			System.out.println("2.Fetch Details");
			System.out.println("3.Delete Details");
			System.out.println("4.Update details");
			
			System.out.println("Please choose any one opertaion to perform.");
			//Reading choice from the user.
			ch=scan.nextInt();
			//Switch operation to switch reader choice to perticular case.
			switch(ch)
			{
			case 1:
					//insert method.
				result=Lic.Insert();
				break;
			case 2:
					//Fetch method.
				Lic.Fetch();
				break;
			case 3:
					//Delete method.
				Lic.Delete();
			case 4:
					//Update method.
				Lic.Update();
			}
			
		}while(ch != 0);
		//For the wrong choice below one is print.
		System.out.println("Wrong selection...");
	}
		//Handling the exception.
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
