package workbook;
//况农合 47率 巩力5
public class AccountTest {
	public static void main(String[] args) {
		Account Acc = new Account();
		
		Acc.setAccount("441-0290-1203");
		Acc.setBalance(500000);
		Acc.setInterestRate(0.073);
		
		Acc.print();
		
		Acc.deposit(20000);
		Acc.print();
		Acc.print2();
		
		
	}
}
