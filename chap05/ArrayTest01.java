package chap05;
//배열의 문법 연습: 사용하는 방법
public class ArrayTest01 {
	public static void main(String[] args) {
		//1. 배열의 선언
		int[] myarray;
		int[] myarray2;
		
		//2. 배열의 생성
		myarray = new int[5];
		myarray2 = new int[5];
		System.out.println(myarray);
		System.out.println(myarray2);
		System.out.println("myarray의 2번 요소의 값 = "+myarray[2]);
		
		//3. 배열의 초기화
		myarray[2] = 100;
		System.out.println("myarray의 2번 요소의 값 = "+myarray[2]);
		
		//배열의 선언과 생성을 한꺼번에 처리
		int[] numarray = new int[3];
		boolean[] boolarray = new boolean[5];
		long[] longarray = new long[100];
		double[] douarray = new double[100];
		
		/*배열의 기본 초기값
		기본형인 경우의 초기값
		-정수형: 0
		-boolean: false
		-실수형: 0.0
		*/
		System.out.println(numarray[0]);
		System.out.println(boolarray[0]);
		System.out.println(longarray[0]);
		System.out.println(douarray[0]);
	}
}