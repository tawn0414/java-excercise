package chap08;

import java.util.Scanner;

//예외가 발생된 곳에서 예외를 처리하도록 정의
//예외가 발생된 곳에서 예외를 처리하면 호출하는 곳에서는 어떤 예외가 발생했는지 알 수 없고 예외가 발생할 때 경우에 따라서 다르게 처리하고 싶어도 할 수 없다.
// =>test()에서 해야할 예외처리를 show()에게 던져서 해결.
public class ThrowsTest01 {
	public int test(int num1, int num2) {//계산만 하는 메소드
		int result = 0;
		try{
			System.out.println("--------test()메소드 내부----------");
			System.out.println("입력값: "+num1);
			System.out.println("입력값: "+num2);
			result = num1/num2;
			System.out.println("결과: "+result);
			System.out.println("--------test()메소드 내부----------");
		}catch(ArithmeticException e) {
			//예외가 발생되면 result변수에는 0을 정의한다.
			result = 0;
		}
		return result;
	}
	public void show() {//숫자를 전달하며 test()를 호출하는 메소드
		Scanner key = new Scanner(System.in);
		System.out.print("숫자입력:");
		int num1 = key.nextInt();
		System.out.print("숫자입력:");
		int num2 = key.nextInt();
		int result = test(num1,num2);
		System.out.println("test()호출결과: "+result);//무조건 실행 되어야하는 명령문
	}
	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();//static에서 non static메소드를 호출할땐 객체를 생성해서 호출해야한다.
		obj.show();
	}

}
