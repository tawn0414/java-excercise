package chap03;
//�񱳿�����: ||, &&(���� ������) : ��� ���� �˻����� �ʰ� ���ǿ� �����ϸ�
//							  skip�ϴ� ��찡 �߻��Ѵ�.
public class OprTest04_Short {

	public static void main(String[] args) {
		int num = 100;
		String str = null;//���� str�� �ƹ��͵� ������� ���� ����
		//str.length(); => �̰� error����.
		System.out.println(num>=100 || str.length()>10);
		System.out.println(num>=100 | str.length()>10);
//      |�� &�� �ΰ� �� �˻���. ||�� &&�� ����ӵ��� ���̱� ���� �տ����� ����
//      Ȯ���� �� ������ �ڿ����� �˻縦 ���Ѵ�.
		
		System.out.println(num<100 & str.length()>10);
		System.out.println(num<100 & str.length()>10);
	}

}
