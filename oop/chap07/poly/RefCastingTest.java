package oop.chap07.poly;
//객체의 형변환: 상속관계에 있는 경우에만 가능하다.
class parent{
	String name = "장동건";
	public void display() {
		System.out.println("부모의 display");
	}
}
class child extends parent{
	String name = "이민호";
	public void display() {
		System.out.println("자식의 display");
	}
	public void test() {
		System.out.println("하위클래스에만 정의된 메소드");
	}
}
public class RefCastingTest {
	public static void main(String[] args) {
		System.out.println("1. super타입의 참조변수로 Super객체를 참조");
		parent obj1 = new parent();
		obj1.display();
		System.out.println(obj1.name);
		
		System.out.println("******************************");
		System.out.println("2. sub타입의 참조변수로 Sub객체를 참조");
		child obj2 = new child();
		obj2.display();
		System.out.println(obj2.name);
		  /*
		   * 이제부터 객체의 형변환 시작.
		     - 변수는 참조변수타입에 따라서 결정이됨, 메소드는 생성되는 객체가 기준이다.
		  */
		System.out.println("******************************");
		System.out.println("3. super타입의 참조변수로 Sub객체를 참조");
		parent obj3 = new child();//자동 형변환이 발생함.
		obj3.display();//이거는 하위클래스의 메소드 호출, 메소드: 오버라이딩된 메소드라면 오버라이딩된 메소드가 호출됨.
		System.out.println(obj3.name);//이거는 상위클래스의 멤버변수 호출, 참조변수 타입에 해당하는 클래스의 멤버변수가 실행됨.
		//타입이 parent타입이지만 실제로 생성된 객체가 child타입이기 때문에 child타입으로
		//형변환이 가능하다.
		//obj3.test();//obj3의 타입이 parent니까 에러뜨는 것.
		((child)obj3).test();//obj3의 parent타입을 child타입으로 형변환 한것.
							//위에는 다운캐스팅
		System.out.println("******************************");
		System.out.println("4. sub타입의 참조변수로 Super객체를 참조-------X");
		//child obj4 = new parent(); 캐스팅 불가.
		
		System.out.println("******************************");
		System.out.println("5. sub타입의 참조변수 = "+"Super타입의 참조변수(Super객체를 참조)-----------X");
		//명시적으로 형변환을 해서 컴파일러는 속였으나 실행시점에 캐스팅을 하려고 할때 obj1이 child정보를 갖고있지 않기 때문에 캐스팅 예외가 발생한다.
		//child obj5 = (child)obj1; 캐스팅 불가. 
		
		System.out.println("******************************");
		System.out.println("6. sub타입의 참조변수 = Super타입의 참조변수(sub객체를 참조)");
		child obj6 = (child)obj3;//변수의 타입이 child니까 이민호가 나옴.
		System.out.println(obj6.name);
		obj6.display();//오버라이딩된 메소드가 호출됨.
		obj6.test();
		
		parent obj7 = obj2;//업캐스팅, obj2가 child타입의 child객체라서 parent를 상속하니까 parent객체랑 parent타입을 갖고있다.
							//parent obj3 = new child();이거랑 같은 의미임. 자동캐스팅은 parent타입이 child타입을 받을 수 있는 것이다.
		//책 358p
		parent obj8 = null;//교재의 car변수
		child obj9 = new child();//fe
		child obj10 = null;//fe2
		
		obj8 = obj9;//super타입 = sub타입, 무조건됨.
		obj10 = (child)obj8;//67번라인때문에 됨. 형변환 가능.
		obj8 = obj10;//67번 라인이 없으면 형변환은 되도 에러뜸. null = null이니까.

	}
}
