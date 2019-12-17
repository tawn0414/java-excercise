package chap09.api.lang;

import java.util.Date;
import java.util.Random;

//Object클래스는 자바에서 작성하는 모든 클래스의 최상위 클래스.
public class ObjectTest01 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.getClass());//클래스의 정보를 return
		System.out.println(obj1.hashCode());//객체의 정보가 return된다.
		System.out.println(obj1.toString());//객체의 주소를 return한다. : 기본메소드라서 생략이 가능하다.
		System.out.println(obj1);//obj1.toString()호출과 동일(기본메소드라서 생략한 것.)
		
		Person p1 = new Person("장동건",50,"서울");
		System.out.println(p1.toString());//개발자가 작성하는 모든 클래스에서 오버라이딩 해야한다. 원래 toString은 주소를 return해주는 것임. 항상 오버라이딩해서 객체의 값을 return할 수 있게끔 해줘야한다.
		System.out.println(p1);
		
		//API의 클래스들...
		Random rand = new Random();
		System.out.println(rand);
		Date d = new Date();
		System.out.println(d);
		String str = new String("java");
		System.out.println(str);
	}
}
