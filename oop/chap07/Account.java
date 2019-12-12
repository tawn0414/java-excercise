package oop.chap07;
//��ũ�� 47�� ����5
public class Account {
	private String account;
	private int balance;
	private String ownewrName;
	private double interestRate;
	
	public Account(){
		
	}
	public Account(int balance) {
		this.balance = balance;
	}
	
	public Account(String account, String ownewrName, int balance) {
		super();
		this.account = account;
		this.balance = balance;
		this.ownewrName = ownewrName;
	}
	
	public String getOwnewrName() {
		return ownewrName;
	}

	public void setOwnewrName(String ownewrName) {
		this.ownewrName = ownewrName;
	}

	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return this.balance;
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
	
	public void withdraw(int amount) {
		this.balance = getBalance()-amount;
	}
	
	public double calculateInterest() {
		return (this.balance * this.interestRate);
	}
	
	public void print() {
		System.out.println("��������: "+getAccount()+" �����ܾ�: "+getBalance());
	}
	
	public void print2() {
		System.out.println("����: "+calculateInterest());
	}

}
