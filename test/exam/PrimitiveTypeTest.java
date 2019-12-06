package test.exam;
//자바 기본형 데이터의 literal에 대해서 살펴보는 예제
public class PrimitiveTypeTest{
	public static void main(String[] args){
		//boolean형
		boolean bool = true; //boolean 타입에서 쓸 수있는 literal의 유형은 true/false
		System.out.println(bool);
		
		//문자형
		char c = 'a'; //character type 변수는 literal을 표현할 때 ''로 표현해야함.
		System.out.println(c);

		//정수형 변수
		//정수형 변수에 기본으로 할당되는 literal의 타입은 int
		byte b = 127; //범위가 넘치지 않으면 byte타입에 int literal을 넣을 수 있다.
		System.out.println(b); // byte = int
		
		short s = 32767; //범위가 넘치지 않으면 short타입에 int literal을 넣을 수 있다.
		System.out.println(s); // short = int

		int i = 2147483647; //int = int
		System.out.println(i);
		
		long l = 2147483648L; //long타입인 경우에는 접미사 L이나 l을 추가한다.
		System.out.println(l); //그냥 2147483648만 입력하면 int의 범위를 넘기 때문.
		
		//실수형
		//실수형 literal의 기본 타입은 double
		float f = 10.5F; //float = double, 접미사 f나 F를 추가한다.
		System.out.println(f); //double이 float보다 byte가 크기 때문.
		
		double d = 10.5;
		System.out.println(d);

		double exam = 10/3; // 10/3은 int형인데 이건 double보다 byte가 작으니까 에러는 없다.
		System.out.println(exam); // double형 이기 때문에 3.0으로 출력됨.

		double exam_ = 10/3.0; // 3.333출력 하고 싶을때. 
		System.out.println(exam_);
	}
}