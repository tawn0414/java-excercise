package oop.chap06;
//�޼ҵ��� �Ű������� returnŸ������ ������, �迭, �⺻�� ��� ����� �� �ִ�.
public class MethodTest {
	public static void main(String[] args) {
		Person p = new Person("�嵿��","����",45);
		display(p.getName(), p.getAddr(), p.getAge());
		display(p);//Person��ü�� �Ű������� ������ �� �ִ�.
	}
	public static void display(String name, String addr, int age) {
		System.out.println(name+","+addr+","+age);
	}
	public static void display(Person p) {
		System.out.println(p.toString());//p��ü�� �ּҰ� �����ִ� ������ ���
	}
	//�޼ҵ带 ������ �� �Ѱ��� ���� return�� �� �ִµ� ���࿡ ������ Ÿ���� �����͸�
	//������ return�ؾ� �Ѵٸ� �迭�� returnŸ������ �����ϰ� ����� �� �ִ�.
	public static int[] getJumsu() {
		int[] myarr = new int[3];
		myarr[0] = 100;
		myarr[1] = 200;
		myarr[2] = 300;
		return myarr;
	}
	//Ÿ���� �ٸ� �������� �����͸� return�ϰ� ���� ��� �迭�� return�� �� �����Ƿ�
	//return�ϰ� ���� ���� ���� �ִ� ��ü�� �����ؼ� return�Ѵ�.
	public static Student getInfo() {
		//Student�� ��� ������ return.
		return new Student("�嵿��", 90, 100, 50, 78);
	}
}
