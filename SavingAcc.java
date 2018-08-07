package com.BankController;


public abstract class SavingAcc extends BankAcc{
	private boolean isSalary;
	private static final float MINBAL=1000;
	
	
	//Parameterized Constructor
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}
	//Overridden withdraw method
	@Override
	abstract public void withdraw(float money);

	
	//Overridden toString method
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}

	
	
}
