package oop.chap06.constructor;
//생성자 연습한거 불러서 사용.
public class MyconstructorTest {
	public static void main(String[] args) {
		//기본 생성자를 호출해서 객체를 생성한 후 setter메소드를 이용해서 값을 초기화하기
		Myconstructor obj = new Myconstructor();
		obj.setName("kk");
		obj.setId("jang");
		obj.setPass("1234");
		System.out.println(obj.getName()+","+obj.getId()+","+obj.getPass());
		System.out.println("------------------------------------");
		//매개변수가 있는 생성자 메소드를 호출하면서 값을 초기화하기.
		//Myconstructor(String,String,String)생성자가 호출된 것.
		Myconstructor obj2 = new Myconstructor("gg", "ee", "hg");
		System.out.println(obj2.getName()+","+obj2.getId()+","+obj2.getPass());
		System.out.println("------------------------------------");
		//Myconstructor(String,String,String,String)생성자가 호출된 것.
		Myconstructor obj3 = new Myconstructor("gg", "ee", "hg","ss");
		System.out.println(obj3.getName()+","+obj3.getId()+","+obj3.getPass()+","+obj3.getNickname());
		//Myconstructor(String,String,String,String,String,int)생성자가 호출된 것.
				Myconstructor obj4 = new Myconstructor("gg", "ee", "hg","ss","서울",1000);
				System.out.println(obj4.getName()+","+obj4.getId()+","+obj4.getPass()+","+obj4.getNickname());
	}
}