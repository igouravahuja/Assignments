package BankImpl;

import bank.CreditInterest;
import bank.DepositAcc;

public class FDAcc implements DepositAcc,CreditInterest
{
	public void createAcc()
	{
		System.out.println("createAcc() Invoked from SavingsAcc");
	}
	public void withdraw()
	{
		System.out.println("withdraw() Invoked from SavingsAcc");
	}
	public void deposit()
	{
		System.out.println("deposit() Invoked from SavingsAcc");
	}
	public void getBalance()
	{
		System.out.println("getBalance() Invoked from SavingsAcc");
	}
	public void calcInt()
	{
		System.out.println("calcInt() Invoked from SavingsAcc");
	}
	public void addMonthlyInt()
	{
		System.out.println("addMonthlyInt() Invoked from SavingsAcc");
	}
	public void addHalfYrlyInt()
	{
		System.out.println("addHalfYrlyInt() Invoked from SavingsAcc");
	}
	public void addAnnualInt()
	{
		System.out.println("addAnnualInt() Invoked from SavingsAcc");
	}
}
