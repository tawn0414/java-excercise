package chap09.api.lang;
//StringBufferTest
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		System.out.println("����=>"+sb);
		
		sb.append("��մ�");//�� ���� �߰��ϴ� �۾�
		System.out.println("����=>"+sb);
		sb.insert(2, "�ڹ�");//2�� index��ġ�� ���ڿ��� �߰��ϴ� �۾�
		System.out.println("����=>"+sb);
		sb.delete(2, 6);//2��°���� 5��°������ index�� ����.
		System.out.println("����=>"+sb);
		sb.reverse();//���ڿ��� ������ �Ųٷ� �ٲ۴�
		System.out.println("����=>"+sb);
	}

}
