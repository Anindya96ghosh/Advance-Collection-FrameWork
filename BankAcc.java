//class BankAcc 

package com.BankController;
public abstract class BankAcc {

	private int accNo;
	private String accNm;
	private float accBal;
	
	
	//Parameterized Constructor
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	abstract public void withdraw(float money);
	
	
	//logic for depositing money
	public void deposite(float money)
	{
		accBal+=money;
	}
	
	
	//getters and setters
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	
	
}
