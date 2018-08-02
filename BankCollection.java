
package com.BankController;


import java.util.ArrayList;

public class BankCollection {

	
	//Declaring array list
	
	public static ArrayList<BankAcc> al=new ArrayList<>();

    // Function to add new Account to the list
	
	public void addNewAccount(BankAcc ba)
	{
		al.add(ba);
	
	}
	
	
	//	function to print the list
	public static String listAll()
	{
		return al.toString();
		
	}
	
}
