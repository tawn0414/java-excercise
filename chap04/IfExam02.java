package chap04;

import java.util.Scanner;

/*성별과 나이를 입력 받아서 다음과 같이 출력하기.
	입력값: 1,3은 남자 2,4는 여자
	나이: 1~19:청소년, 20이후는 성인
[출력형태]
	성별3과 나이 20을 입력한 경우: 성인남자
	성별4와 14를 입력한 경우: 청소년 여자*/
public class IfExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("성별 입력하세요(1과3은 남자, 2와4는 여자) = ");
		int gen = key.nextInt();

		System.out.print("나이를 입력하세요 = ");
		int old = key.nextInt();

		if (gen == 1 | gen == 3) {
			if (old > 0 & old <= 19) {
				System.out.println("청소년남자");
			} else {
				System.out.println("성인남자");
			}
		} else if (gen == 2 | gen == 4) {
			if (old <= 19) {
				System.out.println("청소년여자");
			} else {
				System.out.println("성인여자");
			}
		}

	}

}