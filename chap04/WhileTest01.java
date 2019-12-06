package chap04;
//while문 연습: ForTest01.java에서 작업한 내용을 while문으로 변경
//java를 5번 출력
public class WhileTest01 {
	public static void main(String[] args) {
		int i=1;
		while(i<=5) {
			System.out.println("java"+i);
			i++;
		}
		System.out.println("=================");
		i=1;
		while(true) {
			if(i>5) {
				//반복문을 빠져나가기
				break;
			}
			System.out.println("java"+i);
			i++;
		}

	}

}
