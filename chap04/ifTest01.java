package chap04;

import java.util.Random;
//if문과 Random클래스 연습하기.
public class ifTest01 {
	public static void main(String[] args) {
		//random의 nextInt를 이용해서 1부터 100까지의 값을 발생시킨 후 작업.
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		if(num>=90) {
			System.out.println("num = "+num);
			System.out.println("합격");
		}
			System.out.println("종료");
	}
}

