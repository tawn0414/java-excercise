package chap04;

import java.util.Scanner;

/*������ ���̸� �Է� �޾Ƽ� ������ ���� ����ϱ�.
	�Է°�: 1,3�� ���� 2,4�� ����
	����: 1~19:û�ҳ�, 20���Ĵ� ����
[�������]
	����3�� ���� 20�� �Է��� ���: ���γ���
	����4�� 14�� �Է��� ���: û�ҳ� ����*/
public class IfExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1��3�� ����, 2��4�� ����) = ");
		int gen = key.nextInt();

		System.out.print("���̸� �Է��ϼ��� = ");
		int old = key.nextInt();

		if (gen == 1 | gen == 3) {
			if (old > 0 & old <= 19) {
				System.out.println("û�ҳⳲ��");
			} else {
				System.out.println("���γ���");
			}
		} else if (gen == 2 | gen == 4) {
			if (old <= 19) {
				System.out.println("û�ҳ⿩��");
			} else {
				System.out.println("���ο���");
			}
		}

	}

}