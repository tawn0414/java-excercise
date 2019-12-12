package oop.chap07;

public class CheckingAccount extends Account{
	private String cardNo;
	
	CheckingAccount(){
		
	}

	public CheckingAccount(String account, String ownewrName, int balance, String cardNo) {
		super(account,ownewrName,balance);
		this.cardNo = cardNo;
	}
	/*선생님 블로그에 문제 있음.
	 * CheckingAccount의 pay 메소드는 cardNo 와 일치하고 amount 가 
	balance 보다 작은 경우 잔액이 amount 만큼 차감되면서 지불 기능이 수행될 수 
	있도록 처리하고 그렇지 않은 경우 ”지불이 불가능합니다.”라는 메시지를 출력할 수 있도록 
	작성하세요*/
	public void pay(int amount, String cardNo) {
		if(this.cardNo.equals(cardNo) & amount<=getBalance()) {//this.cardNo==cardNo라고 쓰면 주소를 비교하는게 되서 안된다.
			System.out.println("지불가능합니다.");
			withdraw(amount);
		}else {
			System.out.println("지불이 불가능 합니다.");
		}
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	
	
}
