package test.exam;
public class TypeCastingTest{
	public static void main(String[] args){
		//�⺻������ ����ȯ
		// �ڵ�����ȯ: ū ������Ÿ���� ����=���� ������Ÿ�� ����
		byte b1 = 10;
		short s = b1;
		int i = s;
		long l = i;
		float f = l;
		System.out.println(f);

		char c = 'A';
		System.out.println(c);
		//A�� ascii���� ����ϰ� ���� ���
		int data = c; //int = char : �ڵ�����ȯ
		System.out.println(data);

		//����� ����ȯ
		//�⺻������ ����� ����ȯ �ϴ� ���
		byte bytedata = (byte)200; //���� 200�� int�� byte�� �����ϴ� �Ŷ� ����.
		System.out.println(bytedata); // �̷��� ĳ�����ϸ� 1bit�� 1�̵Ǽ� ������ �����°�
										//�̰��� �Ⱦ�.
		int intdata = 111;
		char chardata = (char)intdata; // int�����͸� char�� ��ȯ�ϴ� ���.
		System.out.println(chardata);

		//115�� char�� ����� ĳ����
		System.out.println((char)115);
		
		//int ������ double�������� �ٲٴ� ��쿡�� ĳ������ �ϵ�������. ex)������
		double doubledata = (double)20/100*100;
		System.out.println(doubledata);

	
		}

}