package oop.chap07;
final class FinalSuper{
	public final void display() {
		System.out.println("super display");
	}
}
class FinalSub extends FinalSuper{//final클래스는 상속이 불가능하다.
	static final int NUM = 100;//상수는 대문자로 쓰는게 약속!!

	@Override//@(annotation):컴파일러에게 이 메소드가 오버라이드된 메소드라는 것을 알려주기 위한 기호.
	public void display() {//final메소드는 오버라이딩 할 수 없다.
		System.out.println("display");
	}
}

public class FinalTest {
	public static void main(String[] args) {
		FinalSub obj = new FinalSub();
		//obj.NUM = 1000;//하위 클래스의 멤버변수에 final쓰니까 상수이므로 수정불가.
		System.out.println(FinalSub.NUM);
		obj.display();
	}
}