package oop.chap06;
//메소드의 매개변수로 기본형과 참조형을 정의하는 경우 차이점.
public class CallByTest {
	public static void main(String[] args) {
		//사용할 기본형변수와 참조형 변수의 초기화
		CallByTest obj = new CallByTest();
		int i = 100;//매개변수가 기본형
		int[] myarr = new int[5];//매개변수가 참조형
		for (int j = 0; j < myarr.length; j++) {
			myarr[j] = 100;
		}
		System.out.println("-------------change호출 전---------------");
		obj.display(i, myarr);
		obj.change(i, myarr);
		System.out.println("-------------change호출 후---------------");
		obj.display(i, myarr);
	}
	//매개변수로 전달된 num의 값과 myarr가 참조하는 배열의 요소값을 출력하는 메소드
	public void display(int num, int[] myarr) {
		System.out.println("i="+num);
		System.out.println("myarr의 요소 값");
		for (int i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i]+"\t");
		}
		System.out.println();
	}
	//매개변수로 전달된 i와 myarr가 참조하는 배열의 요소 값을 변경하는 메소드
	public void change(int i, int[] myarr) {
		i = 200;
		myarr[1] = 200;
	}
	//참조형 변수 자체가 주소를 저장하기 때문에 같은 객체를 공유하게 되니까 위처럼 하면
	//배열(참조형)은 값이 바뀌니까 조심해라.=> 메소드에서 바꾸면 값이 바뀜.
	//기본형 변수는 read만 됨. => 메소드에서 바꿔도 값이 안바뀜.

}
