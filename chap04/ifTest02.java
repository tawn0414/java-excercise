package chap04;

import java.util.Scanner;
//if else���� Scanner�����ϱ�.
public class ifTest02 {
	public static void main(String[] args) {
		/*Scanner�� ������ �Է¹޾� 90�� �̻��̸� "���"�� ����ϰ�
		90�̸��̸� "�����"�� ����ϼ���.*/
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		if(num>=90) {
			System.out.println("���");
		}else {
			System.out.println("�����");
		}
	}

}
