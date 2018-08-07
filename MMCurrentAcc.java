package com.BankController;

public class MMCurrentAcc extends CurrentAcc{

	//Parameterized Constructor
	public MMCurrentAcc(int accNo, String accNm, float accBal,float creditLimit)
	{
		super(accNo,accNm,accBal,creditLimit);
	}
	
	//logic to withdraw money for current account
	@Override
	public void withdraw(float money)
	{
		float CL=getCreditLimit();
		float AB=getAccBal();
		if(((getAccBal()+getCreditLimit())-money)>=0)
		{
			setAccBal(getAccBal()-money);
		}
		else
		{
			System.out.println("withdrwal money less than sum of accBal and creditLimit is not allowed ");
			System.exit(0);
		}
		
	}

	

	//Overriden toString method
	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + "]";
	}

	
	
}
