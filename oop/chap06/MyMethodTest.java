package oop.chap06;
//MyMethodŬ�������� ������ �޼ҵ带 ����ϴ� Ŭ����.
public class MyMethodTest {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		MyMethod m = new MyMethod();
		//1. �Ű������� ���� void�� �޼ҵ��� ȣ��
		//�ڵ��� �ߺ�����, �޼ҵ� ���� ����
		m.display();
		System.out.println("step1");
		m.display();
		System.out.println("step2");
		m.display();
		System.out.println("----------------------------------");
		//2. �Ű������� �Ѱ��̰� return���� ���� �޼ҵ��� ȣ��
		m.display("��");
		m.display("��");
		m.display("��");
		System.out.println("----------------------------------");
		
		//3. ���ϰ��� ���� �Ű������� �ΰ��� �޼ҵ�
		m.display("��", 5);//display(String,int)������ ã�´�.
						  //�̷��� ���� �ȵǾ� ������ ȣ���� ����. ���� �߿�.
		System.out.println("----------------------------------");
		
		//4. �Ű������� return���� ��� �ִ� �޼ҵ�
		//�޼ҵ带 ȣ���ϴ� ��� return���� �����ϴ� �޼ҵ���
		// - return���� ������ Ÿ���� ������ �����ؼ� ������ �־�� �Ѵ�.
		// - �ٸ� �޼ҵ��� �Ű������� ������ �� �ִ�.
		int result = m.add(100,200);
		System.out.println("�޼ҵ� ȣ�� ��� =>"+result);
		
		System.out.println("�޼ҵ� ȣ�� ��� =>"+m.add(200,300));
		
		System.out.println("���α׷� ����");
		

	}

}
