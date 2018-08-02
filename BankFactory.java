//Class for declaring abstract methods
package com.BankController;


public abstract class BankFactory {
	public abstract MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried); 
	public abstract MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit);
	
}
