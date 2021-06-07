package BankImpl;

import bank. LoanAcc;
import bank.DebitInterest;

public class PersonalLoanAcc implements LoanAcc,DebitInterest
{
	public void createAcc()
	{
		System.out.println("createAcc() Invoked from SavingsAcc");
	}
	public void repayPrincipal()
	{
		System.out.println("repayPrincipal() Invoked from SavingsAcc");
	}
	public void payInterest()
	{
		System.out.println("payInterest() Invoked from SavingsAcc");
	}
	public void payPartialPrincipal()
	{
		System.out.println("payPartialPrincipal() Invoked from SavingsAcc");
	}
	public void calcInt()
	{
		System.out.println("calcInt() Invoked from SavingsAcc");
	}
	public void deductMonthlyInt()
	{
		System.out.println("addMonthlyInt() Invoked from SavingsAcc");
	}
	public void deductHalfYrlyInt()
	{
		System.out.println("addHalfYrlyInt() Invoked from SavingsAcc");
	}
	public void deductAnnualInt()
	{
		System.out.println("addAnnualInt() Invoked from SavingsAcc");
	}
}
