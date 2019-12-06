package chap04;

import java.util.Scanner;

//multiif예제 - 학점평가
public class ScoreMultiIfExam {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
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
			System.out.println("점수가 잘못 입력되었습니다.");
		}

	}

}