package api.util;

import java.util.Scanner;

/*Scanner클래스(API)의 사용법
=> 프로그램 실행 중간에 값을 입력받을 수 있는 기능들을 제공하는 클래스*/
public class ScannerTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		String data = key.next();
		System.out.println("키보드로 입력받은 문자열: "+data);
		System.out.print("숫자를 입력하세요.");
//console에 java program치면 java만 출력됨. next는 한 문자열만 출력하니까.
//println은 console에 치고 엔터 눌러야함. print는 엔터 안 눌러도됨.
		int intval = key.nextInt();
		System.out.println("입력받은 숫자 => "+intval);
	}

}
