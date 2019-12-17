package chap08;

import java.util.Scanner;

//况农合 47率 巩力5, 71率
public class AccountTest {
	public static void main(String[] args) {
		Account Acc = new Account();

		Acc.setAccount("441-0290-1203");
		Acc.setBalance(500000);
		Acc.setInterestRate(0.073);
		
		Acc.print();
		try {
			Acc.deposit(-10);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Acc.withdraw(600000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		Acc.print2();
	}
}
