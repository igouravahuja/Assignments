package BankImpl;

public class MyAccount
{
	public static void main(String[] args)
	{
		SavingsAcc obj1=new SavingsAcc();
		System.out.println("=======Methods of SavingsAcc Class======");
		obj1.createAcc();
		obj1.withdraw();
		obj1.deposit();
		obj1.getBalance();
		obj1.calcInt();
		obj1.addMonthlyInt();
		obj1.addHalfYrlyInt();
		obj1.addAnnualInt();
		System.out.println();
		
		FDAcc obj2=new FDAcc();
		System.out.println("=======Methods of FDAcc Class======");
		obj2.createAcc();
		obj2.withdraw();
		obj2.deposit();
		obj2.getBalance();
		obj2.calcInt();
		obj2.addMonthlyInt();
		obj2.addHalfYrlyInt();
		obj2.addAnnualInt();
		System.out.println();
		
		PersonalLoanAcc obj3=new PersonalLoanAcc();
		System.out.println("=======Methods of PersonalLoanAcc Class======");
		obj3.createAcc();
		obj3.repayPrincipal();
		obj3.payInterest();
		obj3.payPartialPrincipal();
		obj3.calcInt();
		obj3.deductMonthlyInt();
		obj3.deductHalfYrlyInt();
		obj3.deductAnnualInt();
		System.out.println();
		
		HousingLoanAcc obj4=new HousingLoanAcc();
		System.out.println("=======Methods of HousingLoanAcc Class======");
		obj4.createAcc();
		obj4.repayPrincipal();
		obj4.payInterest();
		obj4.payPartialPrincipal();
		obj4.calcInt();
		obj4.deductMonthlyInt();
		obj4.deductHalfYrlyInt();
		obj4.deductAnnualInt();
	}

}
