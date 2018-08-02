package com.BankController;


public abstract class SavingAcc extends BankAcc{
	private boolean isSalary;
	private static final float MINBAL=1000;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}
	@Override
	abstract public void withdraw(float money);

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}

	
	
}
