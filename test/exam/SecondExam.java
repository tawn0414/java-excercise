package test.exam;
public class SecondExam{
	public static void main(String[] args){
		int num1 = 200;
		int num2 = 100;
		int result = num1 + num2;
		System.out.println("num1 => "+num1);
		System.out.println("num2 => "+num2);
		System.out.println("연산결과(+) => "+result);
		
		//한 줄 주석문 (설명문): 실행 안되는 명령문.
		//result는 변수이므로 값 변경 가능.
		result = num1 - num2;
		System.out.println("연산결과(-) => "+result);

		result = num1 * num2;
		System.out.println("연산결과(*) => "+result);

		num2 = 30;
		result = num1 / num2;
		System.out.println("연산결과(/) => "+result);

		result = num1 % num2;
		System.out.println("연산결과(%) => "+result);
	}
}