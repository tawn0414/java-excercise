package chap04;

import java.util.Scanner;

//multiif���� - ������
public class ScoreMultiIfExam {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int score = key.nextInt();

		if (score >= 90 & score <= 100) {
			System.out.println("A");
		} else if (score >= 80 & score <= 89) {
			System.out.println("B");
		} else if (score >= 70 & score <= 79) {
			System.out.println("C");
		} else if (score >= 60 & score <= 69) {
			System.out.println("D");
		} else if (score >= 0 & score <= 59) {
			System.out.println("F");
		} else {
			System.out.println("������ �߸� �ԷµǾ����ϴ�.");
		}

	}

}