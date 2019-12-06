package chap04;

import java.util.Scanner;

//if~ else if문 테스트
public class MultiIfTest {
	public static void main(String[] args) {
	Scanner key = new Scanner(System.in);
	System.out.print("주민번호를 입력하세요: ");
	int ssn = key.nextInt(); //7번째 숫자를 입력받을 것. 1,2,3,4
	
	if(ssn==1 | ssn==3) {
		System.out.println("남자");
	}else if(ssn==2 | ssn==4){
		System.out.println("여자");
	}else {
		System.out.println("기타");
	}

	}

}
