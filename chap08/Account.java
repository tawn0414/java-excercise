package chap08;
//워크북 47쪽 문제5, 71쪽
public class Account {
	private String account;
	private int balance;
	private double interestRate;
	public Account() {
		
	}
	
	public Account(String account, int balance, double interestRate) {
		super();
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
	
	public void deposit(int money) throws Exception{
		if (money<0) {
			throw new Exception("입금 금액이 0보다 적습니다.");
		}
		
		this.balance = getBalance()+money;
	}
	
	public void withdraw(int money) throws Exception{
		if(money<0 | money>this.balance) {
			throw new Exception("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		}
		
		this.balance = getBalance()-money;
	}
	
	public double calculateInterest() {
		return (this.balance * this.interestRate);
	}
	
	public void print() {
		System.out.println("계좌정보: "+getAccount()+" "+getBalance()+" "+getInterestRate());
	}
	
	public void print2() {
		System.out.println("이자: "+calculateInterest());
	}

}
