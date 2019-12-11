package oop.chap07;
//StaticDemo를 테스트하는 클래스
//static변수는 한번만 메모리에 올라가기 때문에 값이 바뀌면 그대로 자동으로 저장된다.
//static으로 선언한 변수는 인스턴스의 고유한 값을 저장하는 인스턴스 변수가 아니므로
//인스턴스 변수로 접근할 수 없고 클래스 명으로 접근해야한다.
public class StaticDemoTest {
	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo("obj1");
		obj1.display();
		System.out.println(obj1.num+","+obj1.staticNum);
		
		StaticDemo obj2 = new StaticDemo("obj1");
		obj2.display();
		System.out.println(obj2.num+","+obj2.staticNum);
		
		StaticDemo obj3 = new StaticDemo("obj1");
		obj3.display();
		System.out.println(obj3.num+","+obj3.staticNum);
	}

}
