package oop.chap07;

public class CheckingAccount extends Account{
	private String cardNo;
	
	CheckingAccount(){
		
	}

	public CheckingAccount(String account, String ownewrName, int balance, String cardNo) {
		super(account,ownewrName,balance);
		this.cardNo = cardNo;
	}
	/*������ ��α׿� ���� ����.
	 * CheckingAccount�� pay �޼ҵ�� cardNo �� ��ġ�ϰ� amount �� 
	balance ���� ���� ��� �ܾ��� amount ��ŭ �����Ǹ鼭 ���� ����� ����� �� 
	�ֵ��� ó���ϰ� �׷��� ���� ��� �������� �Ұ����մϴ�.����� �޽����� ����� �� �ֵ��� 
	�ۼ��ϼ���*/
	public void pay(int amount, String cardNo) {
		if(this.cardNo.equals(cardNo) & amount<=getBalance()) {//this.cardNo==cardNo��� ���� �ּҸ� ���ϴ°� �Ǽ� �ȵȴ�.
			System.out.println("���Ұ����մϴ�.");
			withdraw(amount);
		}else {
			System.out.println("������ �Ұ��� �մϴ�.");
		}
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	
	
}
