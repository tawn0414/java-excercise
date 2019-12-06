package chap03;

import java.util.Random; /*// new Random()먼저 클래스안에 친 후 
							ctrl+shift+o*/

public class APIExam {
	public static void main(String[] args) {
	Random rand = new Random();
	int r =rand.nextInt(100);
	System.out.println("랜덤값 => "+(r+1));
	
	r = rand.nextInt();
	System.out.println("랜덤값 => "+r);

	}

}

/*<문제>
1) Random클래스를 이용해서 작업
	- nextInt메소드 호출해서 랜덤값을 출력.*/