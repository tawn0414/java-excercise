package chap05;

import java.util.Random;

//배열의 선언, 생성, 초기화를 한꺼번에 처리하는 방법.
public class ArrayTest04 {
	public static void main(String[] args) {
		//다른 언어와 동일한 방법으로 선언하는 방법: 중괄호 후 콤마로 배열 요소를 구분한다.
		//int[] myarr = new int[5]와 똑같은 의미이다.
		int[] myarr = {10, 20, 30, 40, 50};
		System.out.println("배열의 요소의 갯수: "+myarr.length);
		
		for(int i = 0; i<myarr.length; i++) {
			System.out.println(myarr[i]);
		}
		System.out.println("---------------------------");
		//자바 언어답게 선언, 생성, 초기화를 시키는 방법이지만 위의 방법을 더 많이 씀.
		int[] myarr2 = new int[] {10,20,30,40,50};
		System.out.println("배열의 요소의 갯수: "+myarr2.length);
		
		for (int i = 0; i<myarr2.length; i++) {
			System.out.println(myarr2[i]);
		}
		System.out.println("---------------------------");
		//참조형 배열의 선언, 생성, 초기화를 한꺼번에
		String[] strArr = {new String("java"),
							new String("survlet"),
							new String("spring")};
		System.out.println("참조형 배열의 갯수: "+strArr.length);
		/*원래는 참조형 배열이기 때문에 객체가 할당된 곳의 주소값이 출력되어야 하지만
		String은 예외여서 java, survlet, spring이 출력된 것이다.*/
		for(int i = 0; i<strArr.length; i++) {
			System.out.println("배열 요소 = "+strArr[i]);
		}
		System.out.println("---------------------------");
		//Random은 주소로 나옴. 원래는 이렇게 나오는게 정상임.
		Random[] randArr = {new Random(), new Random()};
		for(int i = 0; i<randArr.length; i++) {
			System.out.println("배열요소 = "+randArr[i]);
		}
		System.out.println("---------------------------");
		//String클래스는 가장 많이쓰는 참조형이기 때문에 기본형처럼 사용할 수 있다.
		String[] strArr2 = {"java", "survlet", "spring","hadoop"};
		System.out.println("갯수: "+strArr2.length);
		for(int i = 0; i<strArr2.length; i++) {
			System.out.println(strArr2[i]);
		}
	}

}
