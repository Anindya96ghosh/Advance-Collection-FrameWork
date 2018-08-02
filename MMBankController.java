package com.BankController;

public class MMBankController extends BankController {

	private BankCollection bc;
	private BankFactory bf;
	
	public MMBankController(BankFactory bf) {
		super(bf);
		this.bf=bf;
		bc= new BankCollection();
	}

	@Override
	public void createNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		MMBankFactory bankFactory= new MMBankFactory();
		
		BankAcc ba = bankFactory.getNewSavingAcc(accNo, accNm, accBal, isSalary);
		bc.addNewAccount(ba);
	}

	@Override
	public void createNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMBankFactory bankFactory= new MMBankFactory();
		BankAcc ba =bankFactory.getNewCurrentAcc(accNo, accNm, accBal, creditLimit);
		bc.addNewAccount(ba);
	}

	@Override
	public void presentAccountToView(int accNo) {
		for(BankAcc ba:bc.al)
		{
			if(accNo==ba.getAccNo())
				ba.toString();
				System.out.println(ba);
		}
		
		
	}
	
	

}
