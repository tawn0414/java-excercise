package chap04;
import java.util.Scanner;
//숫자를 입력받아서 음수인지 양수인지 출력하기.
//단, 양수인 경우에는 짝수인지 홀수인지 출력하기. 0은 제외.
public class IfExam01 {
	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		int num = key.nextInt();
		System.out.print("숫자를 입력하세요: ");
		
		if(num<0) {
			System.out.println("음수");
		}else {
			if(num%2==0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}

	}

}
