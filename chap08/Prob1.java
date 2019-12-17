package chap08;

import java.util.Scanner;
public class Prob1 {
	//필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
		String str= scan.nextLine();
		int result= 0;
		try {
			result = convert(str);
		}catch(IllegalArgumentException e) {
			System.out.println("예외가 발생되었습니다 . 문자열을 입력하지 않고 Enter 키를 누르셨습니다");
		}
		//try~catch로 예외처리
	}

	//필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
	private static int convert(String str) throws IllegalArgumentException{
		int con = Integer.parseInt(str);	
		if (str == null | str.length()==0) {
				throw new IllegalArgumentException();
			}//if가 발생할때 IllegalArgumentException(); 이런 에러를 사용하겠다. 근데 throws옆의 애한테 어떻게 에러를 처리할지 넘기겠다. try블럭이 실행될 때 오류가 나면 catch옆의 애가 에러를 처리한다.

		return con;
	}
}