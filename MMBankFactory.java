package com.BankController;
public class MMBankFactory extends BankFactory{

	//functions to create objects of MM Saving Account and MM Current Account 
	@Override
	public MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal,boolean isSalaried)
	{
		MMSavingAcc savingAcc=new MMSavingAcc(accNo,accNm,accBal,isSalaried);
		return savingAcc;
	}
	
	
	@Override	
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal,float creditLimit)
	{
		MMCurrentAcc currentAcc=new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return currentAcc;
	}
}
