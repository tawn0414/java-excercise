package chap08;
//��ũ�� 67
public class Calculator {
	public double divide(int a, int b) {
		double result = 0.0;
		try { 
			result = a/b;
		}catch(ArithmeticException e) {
			System.out.println("Exception�� �߻��Ͽ����ϴ�. �ٽ� �Է��� �ּ���");
		}
		return result;
	}
}
