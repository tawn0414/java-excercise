package oop.chap07;
/*
 *  <<상속관계에서 메소드가 갖는 특징>> 
 *1.상속관계에서는 상위클래스에 정의된 메소드를 하위클래스에서 사용할 수 있다.
 * => 하위클래스 참조변수를 통해서 접근할 수 있다라는 말.
 *2.상위 클래스에 정의된 메소드와 동일한 메소드를 하위클래스에서 정의하고 사용할 수 있다. 
 *  이런 경우 하위클래스의 메소드가 호출된다.
 *  => 상위클래스에 선언된 메소드와 동일한 메소드를 하위클래스에 정의하는 것을 
 *     메소드 재정의(:메소드 오버라이딩)라고 한다.
 * 메소드 오버라이딩: 메소드 선언부가 부모클래스의 메소드 언선부와 반드시 일치해야한다.
 *               메소드 명, 매개변수 갯수, 매개변수 타입, 리턴 타입 모두 동일해야한다.      
 *3.부모클래스의 메소드를 사용하고 싶은 경우 super로 호출한다. super는 main안에서 못씀.
 */
class parent{
	public void display() {
		System.out.println("부모의 display...");
	}
}
class child extends parent{
	public void display() {
		System.out.println("자식클래스의 display");//이렇게 하니까 test()의 display()는 이게 호출된다.
		super.display();
	}
	public void test() {
		System.out.println("자식클래스의 test...");
		display();//1번내용. 같은 클래스에 있을때 뿐만 아니라 부모클래스에 있는 메소드를 이렇게 쓸 수 있다.
	}
}

public class InheritanceTest02 {
	public static void main(String[] args) {
		child obj = new child();
		obj.test();
		obj.display();//이렇게 상위 클래스의 메소드에 접근할 수도 있다.

	}

}
