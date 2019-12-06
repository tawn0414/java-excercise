package test.exam;
//�ڹ� �⺻�� �������� literal�� ���ؼ� ���캸�� ����
public class PrimitiveTypeTest{
	public static void main(String[] args){
		//boolean��
		boolean bool = true; //boolean Ÿ�Կ��� �� ���ִ� literal�� ������ true/false
		System.out.println(bool);
		
		//������
		char c = 'a'; //character type ������ literal�� ǥ���� �� ''�� ǥ���ؾ���.
		System.out.println(c);

		//������ ����
		//������ ������ �⺻���� �Ҵ�Ǵ� literal�� Ÿ���� int
		byte b = 127; //������ ��ġ�� ������ byteŸ�Կ� int literal�� ���� �� �ִ�.
		System.out.println(b); // byte = int
		
		short s = 32767; //������ ��ġ�� ������ shortŸ�Կ� int literal�� ���� �� �ִ�.
		System.out.println(s); // short = int

		int i = 2147483647; //int = int
		System.out.println(i);
		
		long l = 2147483648L; //longŸ���� ��쿡�� ���̻� L�̳� l�� �߰��Ѵ�.
		System.out.println(l); //�׳� 2147483648�� �Է��ϸ� int�� ������ �ѱ� ����.
		
		//�Ǽ���
		//�Ǽ��� literal�� �⺻ Ÿ���� double
		float f = 10.5F; //float = double, ���̻� f�� F�� �߰��Ѵ�.
		System.out.println(f); //double�� float���� byte�� ũ�� ����.
		
		double d = 10.5;
		System.out.println(d);

		double exam = 10/3; // 10/3�� int���ε� �̰� double���� byte�� �����ϱ� ������ ����.
		System.out.println(exam); // double�� �̱� ������ 3.0���� ��µ�.

		double exam_ = 10/3.0; // 3.333��� �ϰ� ������. 
		System.out.println(exam_);
	}
}