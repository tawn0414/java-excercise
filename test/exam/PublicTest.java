package test.exam;

import oop.chap06.Person;

//기본으로 인식하는 패키지의 위치는 java.lang패키지와 현재 작업 패키지다.
//그래서 다른 패키지에 있는 클래스를 사용하는 경우에는 API나 내가 작성한 클래스나 모두 import해줘야한다.
public class PublicTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "장";
		p1.addr = "서";//addr은 defalut이므로 외부 패키지에서 접근할 수 없다.
		p1.age = "4";//age는 private이므로 외부 패키지/클래스 모두 접근할 수 없다.

	}

}
