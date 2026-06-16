package com.tnsif.interfaces;

public class BankImple implements Bank{

	@Override
	public void deposite(Account account, double amount) {
		if(amount>DEPOSITE_LIMIT)
		{
			System.out.println("Deposite is not possible for this account"+account.getBal());
		}
		else {
			account.setBal(account.getBal()+amount);
			System.out.println("Deposited the amount to the account now the balance is:"+account.getBal());
		}
		
	}

	@Override
	public void withdrawl(Account account, double amount) {
		if((account.getBal()-amount)>MIN_BAL)
		{
			account.setBal(account.getBal()-amount);
			System.out.println("The transaction is successfully completed now the bal is :"+account.getBal());
		}else {
			System.out.println("The transaction is failed");
		}
		
	}

	

}
