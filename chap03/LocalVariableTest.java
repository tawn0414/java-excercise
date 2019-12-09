package chap03;
/*
자바에는 전역변수라는 용어는 없고 지역변수만 있다.
지역변수 : {}(블럭) 안에서 선언된 변수
               선언된 블럭이 종료되면 메모리에서 해제.
               [규칙]
         1) 선언된 블럭 내부에서만 사용이 가능
         2) 반드시 초기화 작업을 해야한다.
*/
public class LocalVariableTest {
	public static void main(String[] args) {
		int num = 90;
		int sum;
		if(num>=90) {
			String str = new String("합격");
			//sum = sum+100; //sum변수는 main메소드 블럭에서 선언된 지역변수이므로
						   //초기화 작업을 하지 않고 사용할 수 없다.
		}
		//System.out.println(str); //str변수는 if블럭에서 선언되었으므로
								 //if 블럭 밖에서는 접근할 수 없다.
	}

}
