package oop.chap07;
final class FinalSuper{
	public final void display() {
		System.out.println("super display");
	}
}
class FinalSub extends FinalSuper{//finalŬ������ ����� �Ұ����ϴ�.
	static final int NUM = 100;//����� �빮�ڷ� ���°� ���!!

	@Override//@(annotation):�����Ϸ����� �� �޼ҵ尡 �������̵�� �޼ҵ��� ���� �˷��ֱ� ���� ��ȣ.
	public void display() {//final�޼ҵ�� �������̵� �� �� ����.
		System.out.println("display");
	}
}

public class FinalTest {
	public static void main(String[] args) {
		FinalSub obj = new FinalSub();
		//obj.NUM = 1000;//���� Ŭ������ ��������� final���ϱ� ����̹Ƿ� �����Ұ�.
		System.out.println(FinalSub.NUM);
		obj.display();
	}
}