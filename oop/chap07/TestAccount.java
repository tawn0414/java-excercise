package oop.chap07;

import java.util.Scanner;
//CheckingAccount의 pay메소드에서 this.cardNo==cardNo로 하니까"1234-5647-8888"이렇게 값 안주고 cardNo로 값 주니까 주소와 주소를 비교하는 것이 됨.
//따라서 문자열 비교는 리터럴이든 참조형이든 무조건 equals()를 이용해서 비교한다!!('=='이거는 안된다.)
public class TestAccount {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		CheckingAccount acc1 = 
			new CheckingAccount("111-222-333","장동건"
					,1000000,"1234-5647-8888");
		System.out.print("카드번호 입력:");
		String cardNo = key.next();
		acc1.pay(500000,"1234-5678-8888");
		System.out.println("현재잔액====>"+acc1.getBalance());//지불 불가능이라 현재잔액1000000 
		System.out.println("-------------");
		acc1.pay(500000,cardNo);//"1234-5647-8888"
		System.out.println("현재잔액====>"+acc1.getBalance());//지불 가능이라 현재잔액 500000
	}
}