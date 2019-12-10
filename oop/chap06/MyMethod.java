package oop.chap06;
//메소드를 정의하는 연습을 위한 클래스
public class MyMethod {
		//1. 매개변수가 없고 return값이 없는 메소드
			public void display() {
				for(int i = 1; i<=10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		//2. return값이 없고 매개변수가 한 개인 메소드
			public void display(String str) {
				for(int i = 1; i<=10; i++) {
					System.out.print(str);
				}
				System.out.println();
			}
		//3. 리턴값이 없고 매개변수가 두개인 메소드
		// => 출력기호, 출력할 횟수를 매개변수로 전달받아 사용할 수 있도록
		//	   메소드를 정의하고, MyMethodTest.java에서 호출해서 테스트하기
			public void display(String str, int num) {
				for(int i = 1; i<=num; i++) {
					System.out.print(str);
				}
				System.out.println();
			}
		//4. 매개변수와 return값이 모두 있는 메소드
		//=> 숫자 2개를 매개변수로 전달받아 더한 결과를 return하는 메소드	
		//   메소드 선언부에 return타입을 정의하는 경우 반드시 메소드의 마지막에서
		//   값을 return해야 한다.
		//	 return타입과 같은 변수를 선언해서 그 변수를 return하는게 정석.	
			public int add(int num1, int num2) {
				int result =0;
				result = num1+num2;
				return result;
			} 
}
