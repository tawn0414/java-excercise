package chap08;
//워크북 67
public class Calculator {
	public double divide(int a, int b) {
		double result = 0.0;
		try { 
			result = a/b;
		}catch(ArithmeticException e) {
			System.out.println("Exception이 발생하였습니다. 다시 입력해 주세요");
		}
		return result;
	}
}
