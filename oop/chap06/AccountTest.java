package oop.chap06;
//��ũ�� 47�� ����5
public class AccountTest {
	public static void main(String[] args) {
		Account Acc = new Account("441-0290-1203",500000,7.3);
		
		Acc.print();
		
		Acc.deposit(20000);
		Acc.print();
		Acc.print2();	
	}
}
