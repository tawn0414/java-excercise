package chap04;

import java.util.Scanner;

/*�������� �Է� �޾� ����ϱ�
[�������]
����� ��:___
7*1 = 7
7*2 = 14
.....*/
public class ForExam02 {

	public static void main(String[] args) {
		System.out.print("����� ��: ");
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		
		for(int i = 1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}

	}

}
