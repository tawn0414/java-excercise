package oop.chap06;

import oop.chap07.Student;

//메소드의 매개변수와 return타입으로 참조형, 배열, 기본형 모두 사용할 수 있다.
public class MethodTest {
	public static void main(String[] args) {
		Person p = new Person("장동건","서울",45);
		display(p.getName(), p.getAddr(), p.getAge());
		display(p);//Person객체를 매개변수로 전달할 수 있다.
	}
	public static void display(String name, String addr, int age) {
		System.out.println(name+","+addr+","+age);
	}
	public static void display(Person p) {
		System.out.println(p.toString());//p객체의 주소가 갖고있는 정보를 출력
	}
	//메소드를 정의할 때 한개의 값만 return할 수 있는데 만약에 동일한 타입의 데이터를
	//여러개 return해야 한다면 배열을 return타입으로 정의하고 사용할 수 있다.
	public static int[] getJumsu() {
		int[] myarr = new int[3];
		myarr[0] = 100;
		myarr[1] = 200;
		myarr[2] = 300;
		return myarr;
	}
	//타입이 다른 여러개의 데이터를 return하고 싶은 경우 배열로 return할 수 없으므로
	//return하고 싶은 값을 갖고 있는 객체를 생성해서 return한다.
	public static Student getInfo() {
		//Student의 모든 정보를 return.
		return new Student("장동건", 90, 100, 50, 78);
	}
}
