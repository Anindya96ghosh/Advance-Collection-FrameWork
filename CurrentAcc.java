

package com.BankController;

public abstract class CurrentAcc extends BankAcc{

	private final float creditLimit;

	//Parameterized Constructor
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	@Override
	abstract public void withdraw(float money);

	
	//getters

	public float getCreditLimit() {
		return creditLimit;
	}

	
	
}
