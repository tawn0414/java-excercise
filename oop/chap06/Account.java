package oop.chap06;
//��ũ�� 47�� ����5
public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {
		
	}
	
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void deposit(int money) {
		this.balance = getBalance()+money;
	}
	
	public void withdraw(int money) {
		this.balance = getBalance()-money;
	}
	
	public double calculateInterest() {
		return (this.balance * this.interestRate/100);
	}
	
	public void print() {
		System.out.println("��������: "+getAccount()+" �����ܾ�: "+getBalance());
	}
	
	public void print2() {
		System.out.println("����: "+calculateInterest());
	}

}
