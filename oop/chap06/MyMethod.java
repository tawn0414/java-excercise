package oop.chap06;
//�޼ҵ带 �����ϴ� ������ ���� Ŭ����
public class MyMethod {
		//1. �Ű������� ���� return���� ���� �޼ҵ�
			public void display() {
				for(int i = 1; i<=10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		//2. return���� ���� �Ű������� �� ���� �޼ҵ�
			public void display(String str) {
				for(int i = 1; i<=10; i++) {
					System.out.print(str);
				}
				System.out.println();
			}
		//3. ���ϰ��� ���� �Ű������� �ΰ��� �޼ҵ�
		// => ��±�ȣ, ����� Ƚ���� �Ű������� ���޹޾� ����� �� �ֵ���
		//	   �޼ҵ带 �����ϰ�, MyMethodTest.java���� ȣ���ؼ� �׽�Ʈ�ϱ�
			public void display(String str, int num) {
				for(int i = 1; i<=num; i++) {
					System.out.print(str);
				}
				System.out.println();
			}
		//4. �Ű������� return���� ��� �ִ� �޼ҵ�
		//=> ���� 2���� �Ű������� ���޹޾� ���� ����� return�ϴ� �޼ҵ�	
		//   �޼ҵ� ����ο� returnŸ���� �����ϴ� ��� �ݵ�� �޼ҵ��� ����������
		//   ���� return�ؾ� �Ѵ�.
		//	 returnŸ�԰� ���� ������ �����ؼ� �� ������ return�ϴ°� ����.	
			public int add(int num1, int num2) {
				int result =0;
				result = num1+num2;
				return result;
			} 
}
