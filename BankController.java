//Controller Class for declaring abstract methods

package com.BankController;

public abstract class BankController {
	private BankCollection bc;
	private BankFactory bf;
	
	
	public BankController(BankFactory bf) {
		super();
		this.bf = bf;
	}
	

	
	public abstract void createNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit);	
	
	public abstract void presentAccountToView(int accNo);

	public abstract void createNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary);
	
	
	
	
}
