package chap05;

import java.util.Random;
import java.util.Scanner;

//참조형데이터 배열 만들기
public class ArrayTest02 {
	public static void main(String[] args) {
		String[] strArr = new String[3];
		Random[] randArr = new Random[5];
		Scanner[] keyArr = new Scanner[100];

		// 참조형 배열 변수의 초기값은 null, null은 아무것도 참조하지 않는다는 의미.
		// 아직 객체를 만들어서 할당하지 않았기 때문에 null이 나온것.
		System.out.println(strArr[0]);
		System.out.println(randArr[0]);
		System.out.println(keyArr[0]);

		// 참조형 배열의 선언, 생성, 초기화
		// arr이 String이라서 new를 쓴 것.
		String[] arr = new String[3];
		arr[0] = new String("java");
		arr[1] = new String("JDBC");
		arr[2] = new String("HTML5");
		System.out.println(arr[0]);

		// randArr의 초기화
		randArr[0] = new Random();
		randArr[1] = new Random();

		for (int i = 0; i < randArr.length; i++) {
				System.out.println(randArr[i]);
		}
	}

}
