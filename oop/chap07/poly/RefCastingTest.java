package oop.chap07.poly;
//��ü�� ����ȯ: ��Ӱ��迡 �ִ� ��쿡�� �����ϴ�.
class parent{
	String name = "�嵿��";
	public void display() {
		System.out.println("�θ��� display");
	}
}
class child extends parent{
	String name = "�̹�ȣ";
	public void display() {
		System.out.println("�ڽ��� display");
	}
	public void test() {
		System.out.println("����Ŭ�������� ���ǵ� �޼ҵ�");
	}
}
public class RefCastingTest {
	public static void main(String[] args) {
		System.out.println("1. superŸ���� ���������� Super��ü�� ����");
		parent obj1 = new parent();
		obj1.display();
		System.out.println(obj1.name);
		
		System.out.println("******************************");
		System.out.println("2. subŸ���� ���������� Sub��ü�� ����");
		child obj2 = new child();
		obj2.display();
		System.out.println(obj2.name);
		  /*
		   * �������� ��ü�� ����ȯ ����.
		     - ������ ��������Ÿ�Կ� ���� �����̵�, �޼ҵ�� �����Ǵ� ��ü�� �����̴�.
		  */
		System.out.println("******************************");
		System.out.println("3. superŸ���� ���������� Sub��ü�� ����");
		parent obj3 = new child();//�ڵ� ����ȯ�� �߻���.
		obj3.display();//�̰Ŵ� ����Ŭ������ �޼ҵ� ȣ��, �޼ҵ�: �������̵��� �޼ҵ��� �������̵��� �޼ҵ尡 ȣ���.
		System.out.println(obj3.name);//�̰Ŵ� ����Ŭ������ ������� ȣ��, �������� Ÿ�Կ� �ش��ϴ� Ŭ������ ��������� �����.
		//Ÿ���� parentŸ�������� ������ ������ ��ü�� childŸ���̱� ������ childŸ������
		//����ȯ�� �����ϴ�.
		//obj3.test();//obj3�� Ÿ���� parent�ϱ� �����ߴ� ��.
		((child)obj3).test();//obj3�� parentŸ���� childŸ������ ����ȯ �Ѱ�.
							//������ �ٿ�ĳ����
		System.out.println("******************************");
		System.out.println("4. subŸ���� ���������� Super��ü�� ����-------X");
		//child obj4 = new parent(); ĳ���� �Ұ�.
		
		System.out.println("******************************");
		System.out.println("5. subŸ���� �������� = "+"SuperŸ���� ��������(Super��ü�� ����)-----------X");
		//��������� ����ȯ�� �ؼ� �����Ϸ��� �ӿ����� ��������� ĳ������ �Ϸ��� �Ҷ� obj1�� child������ �������� �ʱ� ������ ĳ���� ���ܰ� �߻��Ѵ�.
		//child obj5 = (child)obj1; ĳ���� �Ұ�. 
		
		System.out.println("******************************");
		System.out.println("6. subŸ���� �������� = SuperŸ���� ��������(sub��ü�� ����)");
		child obj6 = (child)obj3;//������ Ÿ���� child�ϱ� �̹�ȣ�� ����.
		System.out.println(obj6.name);
		obj6.display();//�������̵��� �޼ҵ尡 ȣ���.
		obj6.test();
		
		parent obj7 = obj2;//��ĳ����, obj2�� childŸ���� child��ü�� parent�� ����ϴϱ� parent��ü�� parentŸ���� �����ִ�.
							//parent obj3 = new child();�̰Ŷ� ���� �ǹ���. �ڵ�ĳ������ parentŸ���� childŸ���� ���� �� �ִ� ���̴�.
		//å 358p
		parent obj8 = null;//������ car����
		child obj9 = new child();//fe
		child obj10 = null;//fe2
		
		obj8 = obj9;//superŸ�� = subŸ��, �����ǵ�.
		obj10 = (child)obj8;//67�����ζ����� ��. ����ȯ ����.
		obj8 = obj10;//67�� ������ ������ ����ȯ�� �ǵ� ������. null = null�̴ϱ�.

	}
}
