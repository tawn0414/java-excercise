package chap08;
//��ũ�� 67
public class CalcTest {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		//int num2 = Integer.parseInt(args[1]); ������ �̷��� �ص� �Ǵµ� �������� �����ȣ �Է��϶������ϱ� �ؿ�ó���ϱ�!
		int num2 = Integer.parseInt(args[2]);
		Calculator obj = new Calculator();
		System.out.println("���: "+obj.divide(num1,num2));
	}

}
