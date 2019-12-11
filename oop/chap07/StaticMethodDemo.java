package oop.chap07;
//static�޼ҵ带 ������ �� �ִ� ����
// - static����� �����ϱ� ���� �뵵
// - ��ƿ��Ƽó�� ���� ����ϴ� �޼ҵ�
//1���� 2���� �����ų����ϱ� �Ϲ����� ������� ȣ�� ����
public class StaticMethodDemo {
	public static void staticTest1() {
		//1. static�޼ҵ忡�� static�޼ҵ� �����ϱ�:�Ϲ����� ��� ����
		staticTest2();
		System.out.println("staticTest1()");
	}
	public void display() {
		//2. non-static�޼ҵ忡�� non-static�޼ҵ� ȣ��: �Ϲ����� ��� ����
		show();
		System.out.println("display()");
	}
	public static void staticTest2() {
		System.out.println("staticTest2()");
	}
	
	public void show() {
		//3. non-static�޼ҵ忡�� static�޼ҵ� ȣ��: static�޼ҵ��
		//static�޸𸮿� �ö� �����ϱ� ȣ�� ����. �Ϲ����� ������� ȣ�� ����
		staticTest2();
		System.out.println("show()");
	}
	public static void staticTest3() {
		//4. static�޼ҵ忡�� non-static�޼ҵ� ȣ��: non-static�޼ҵ带
		//��ü���� ���߱⶧���� �޸𸮿� �����ϱ� �ȵǴ°�.(�Ʒ� �ּ�ó���ϸ�ȵ�.)
		//show();
		StaticMethodDemo obj = new StaticMethodDemo();
		obj.show();
		System.out.println("staticTest3()");
	}
}
