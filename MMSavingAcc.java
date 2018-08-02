package com.BankController;

public class MMSavingAcc extends SavingAcc{
	private static final float MINBAL=1000;
	private boolean isSalaried;
	public MMSavingAcc(int accNo, String accNm, float accBal,boolean isSalaried)
	{
		
		super(accNo,accNm,accBal,isSalaried);
		this.isSalaried=isSalaried;
	}
	
	@Override
	public void withdraw(float money)
	{
		
		if(isSalaried)
		{
			if((getAccBal()-money)>=0)
			{
				setAccBal(getAccBal()-money);
			}
			else
			{
				System.out.println("withdrwal money less than MINBAL is not allowed ");
			}
		}
		else
		{
			if((getAccBal()-money)>=MINBAL)
			{
				setAccBal(getAccBal()-money);
			}
			else
			{
				System.out.println("withdrwal money less than MINBAL is not allowed ");
			}
		}
		
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried=" + isSalaried + ",  AccNo="
				+ getAccNo() + ", AccNm=" + getAccNm() + ", AccBal=" + getAccBal() + "]";
	}




	
}
