package chap04;
import java.util.Scanner;
//���ڸ� �Է¹޾Ƽ� �������� ������� ����ϱ�.
//��, ����� ��쿡�� ¦������ Ȧ������ ����ϱ�. 0�� ����.
public class IfExam01 {
	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		int num = key.nextInt();
		System.out.print("���ڸ� �Է��ϼ���: ");
		
		if(num<0) {
			System.out.println("����");
		}else {
			if(num%2==0) {
				System.out.println("¦��");
			}else {
				System.out.println("Ȧ��");
			}
		}

	}

}
