package api.util;

import java.util.Scanner;

/*ScannerŬ����(API)�� ����
=> ���α׷� ���� �߰��� ���� �Է¹��� �� �ִ� ��ɵ��� �����ϴ� Ŭ����*/
public class ScannerTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���.");
		String data = key.next();
		System.out.println("Ű����� �Է¹��� ���ڿ�: "+data);
		System.out.print("���ڸ� �Է��ϼ���.");
//console�� java programġ�� java�� ��µ�. next�� �� ���ڿ��� ����ϴϱ�.
//println�� console�� ġ�� ���� ��������. print�� ���� �� ��������.
		int intval = key.nextInt();
		System.out.println("�Է¹��� ���� => "+intval);
	}

}
