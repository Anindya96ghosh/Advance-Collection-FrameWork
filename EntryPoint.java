//Entry Point of the Application

package com.BankController;

public class EntryPoint {

	public static void main(String args[])
	{
		BankFactory mmBankFactory=new MMBankFactory();

		BankController mmBankController= new MMBankController(mmBankFactory);
		
		mmBankController.createNewCurrentAccount(101,"Anindya",2000,10000);
		mmBankController.createNewSavingAccount(107,"AnindyaGhosh",5000,true);
		
		String arr1=BankCollection.listAll();
		System.out.println(arr1);
		mmBankController.presentAccountToView(107);
		
		
		
	}
}






