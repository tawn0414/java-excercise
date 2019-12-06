package chap04;

import java.util.Scanner;

//Switch연습: 기본 문법(MultiIfTest클래스의 내용을 switch로 변경)
//Switch문의 특성을 활용: case1과 3이, case2와 4가 같은 값을 출력
public class SwitchTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요: ");
		int ssn = key.nextInt(); 
		
		switch(ssn) {
			case 1: 
			case 3:
				System.out.println("남자");
				break;
			case 2:
			case 4:
				System.out.println("여자");
				break;
			default: 
				System.out.println("기타");
		}
		
	}

}
