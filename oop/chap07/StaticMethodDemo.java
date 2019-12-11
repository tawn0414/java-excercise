package oop.chap07;
//static메소드를 연습할 수 있는 예제
// - static멤버를 제어하기 위한 용도
// - 유틸리티처럼 자주 사용하는 메소드
//1번과 2번은 같은거끼리니까 일반적인 방법으로 호출 가능
public class StaticMethodDemo {
	public static void staticTest1() {
		//1. static메소드에서 static메소드 접근하기:일반적인 방법 가능
		staticTest2();
		System.out.println("staticTest1()");
	}
	public void display() {
		//2. non-static메소드에서 non-static메소드 호출: 일반적인 방법 가능
		show();
		System.out.println("display()");
	}
	public static void staticTest2() {
		System.out.println("staticTest2()");
	}
	
	public void show() {
		//3. non-static메소드에서 static메소드 호출: static메소드는
		//static메모리에 올라가 있으니까 호출 가능. 일반적인 방법으로 호출 가능
		staticTest2();
		System.out.println("show()");
	}
	public static void staticTest3() {
		//4. static메소드에서 non-static메소드 호출: non-static메소드를
		//객체생성 안했기때문에 메모리에 없으니까 안되는것.(아래 주석처럼하면안됨.)
		//show();
		StaticMethodDemo obj = new StaticMethodDemo();
		obj.show();
		System.out.println("staticTest3()");
	}
}
