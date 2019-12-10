package oop.chap06;
//MyMethod클래스에서 정의한 메소드를 사용하는 클래스.
public class MyMethodTest {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		MyMethod m = new MyMethod();
		//1. 매개변수가 없고 void인 메소드의 호출
		//코드의 중복제거, 메소드 재사용 가능
		m.display();
		System.out.println("step1");
		m.display();
		System.out.println("step2");
		m.display();
		System.out.println("----------------------------------");
		//2. 매개변수가 한개이고 return값이 없는 메소드의 호출
		m.display("★");
		m.display("※");
		m.display("♣");
		System.out.println("----------------------------------");
		
		//3. 리턴값이 없고 매개변수가 두개인 메소드
		m.display("＠", 5);//display(String,int)유형을 찾는다.
						  //이렇게 선언 안되어 있으면 호출을 못함. 순서 중요.
		System.out.println("----------------------------------");
		
		//4. 매개변수와 return값이 모두 있는 메소드
		//메소드를 호출하는 경우 return값이 존재하는 메소드라면
		// - return값과 동일한 타입의 변수를 선언해서 저장해 주어야 한다.
		// - 다른 메소드의 매개변수로 전달할 수 있다.
		int result = m.add(100,200);
		System.out.println("메소드 호출 결과 =>"+result);
		
		System.out.println("메소드 호출 결과 =>"+m.add(200,300));
		
		System.out.println("프로그램 종료");
		

	}

}
