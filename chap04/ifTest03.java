package chap04;
import java.util.Scanner;
//��ø if��: if�� �ȿ� if�� �����ϰ� ����ϱ�(��� ����� ��ø�� �� �ִ�.)
public class ifTest03 {
	public static void main(String[] args) {
		/*Scanner�� ������ �Է¹޾� 90�� �̻��̸� "���"�� ����ϰ�
		90�̸��̸� "�����"�� ����ϼ���.*/
		Scanner key = new Scanner(System.in);
		System.out.print("��������: ");
		int num = key.nextInt();
		 
		System.out.print("���� Ƚ��: ");
		int count = key.nextInt();
		
		if(num>=90) {
			System.out.println("���");
		}else if(count<3){
			System.out.println("�����");
		}else {
			System.out.println("ó������");
		}
	}
}