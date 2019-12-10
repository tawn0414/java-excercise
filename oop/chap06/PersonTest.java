package oop.chap06;
//Person클래스를 사용하는 클래스
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person(); //heap에 Person이라는 객체가 생성되고
		                          //name, age, addr이 저장되어 있다.
		p1.setName("장동건");
		p1.setAddr("서울시");
		p1.setAge(45); //age변수는 private으로 선언되어있으므로 
		             //같은 패키지의 클래스에서도 접근할 수 없다.
		System.out.println("성명: "+p1.getName());
		System.out.println("주소: "+p1.getAddr());
		System.out.println("나이: "+p1.getAge());
		
		//내가 만든 Person클래스를 동시사용 가능. heap에 Person이라는 객체가 한번 더 생성됨.
		Person p2 = new Person(); 
		p2.setName("장동");
		p2.setAddr("서울");
		p2.setAge(4); 
		System.out.println("성명: "+p2.getName());
		System.out.println("주소: "+p2.getAddr());
		System.out.println("나이: "+p2.getAge());

	}

}
