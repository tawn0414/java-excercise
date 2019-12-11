package oop.chap06;
//클래스를 정의하고 멤버변수를 정의하는 방법.
//멤버변수를 정의할 때 접근 제어자를 추가해서 접근을 제어할 수 있다. 접근제어자 없이 만들면
//여기저기서 다 접속할 수 있으니까 보안이 허술하다.
//	public
//	default
//	protected
//	private
//클래스를 정의할 때 멤버변수는 private으로 선언해서 외부에서 접근할 수 없도록 정보를
//은닉하고 public메소드를 통해서 접근할 수 있도록 구현한다.
public class Person {
/*
클래스를 대표하는 변수들, 지금까지는 main안에 선언했음.
클래스의 특성을 나타내는 데이터: 멤버변수 or 필드
멤버변수는 특별한 상황이 아니면 초기값을 주지 않는다.
초기값을 정의하지 않아도 참조형은 null, 정수형은 0, 실수형은 0.0, boolean은 false이다.
데이터 타입은 기본형, 참조형 모두 올 수 있다.
*/
	private String name;
	private String addr;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	
	//모든 멤버변수는 private으로 선언되어 있기 때문에 값을 설정하는 메소드와
	//값을 가져올 수 있는 메소드가 필요하다.
	//이런 역할을 하는 메소드를 정의하는 경우
	
	//private로 막은 멤버변수를 set(변수의 값을 변경이나 설정)이랑 get으로 접근.
	//name변수에 값을 설정하는 메소드(set, set은 return 타입이 void,매개변수는 있다.)
	//메소드명 : set + 멤버변수명(단, 첫글자를 대문자로 바꿔야한다.)
	//		  setName
	public void setName(String name) {//setter메소드
		this.name = name; //this: 멤버변수, 우변: 매개변수
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	//name변수에 저장된 값을 호출하는 곳으로 넘겨줄 메소드(get)
	//get은 보통 매개변수는 없고 항상 return값은 있다.
	//메소드명: get+멤버변수명(단, 첫글자를 대문자로 바꿔야한다.)
	//        getName
	public String getName() {//getter메소드: 값을 갖고올때 쓰는 메소드
		return this.name; //그냥 name만 써도 됨.
	}
	public String getAddr() {
		return this.addr;
	}
	public int getAge() {
		return this.age;
	}

	@Override//source로 추가함.
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
}
