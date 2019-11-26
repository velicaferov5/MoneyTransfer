package main;

public class Account {

	private Integer balance;
	private String name;
	
	public Account() {
	}
	
	public Account(String name,Integer Balance) {
		this.name = name;
		this.balance = Balance;
	}
	
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	
	public void addToBalance(Integer input) {
		this.balance+=input;
	}
	
	public void takeFromBalance(Integer input) {
		this.balance-=input;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String transfer(Account from, Account to, Integer amount) {
		if(from.getBalance()<amount) {
			return "Rev 401: " + from.getName() + " doesn't have sufficient balance for transfer.";
		}
		else if(amount<1) {
			return "Rev 402: " + "Not enough amount to transfer.";
		}
		else {
			from.setBalance(from.getBalance() - amount);
			to.setBalance(to.getBalance() + amount);
			return "Transferred successfully.";
		}
	}
}
