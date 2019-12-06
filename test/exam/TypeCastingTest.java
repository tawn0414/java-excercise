package test.exam;
public class TypeCastingTest{
	public static void main(String[] args){
		//기본형에서 형변환
		// 자동형변환: 큰 데이터타입의 변수=작은 데이터타입 변수
		byte b1 = 10;
		short s = b1;
		int i = s;
		long l = i;
		float f = l;
		System.out.println(f);

		char c = 'A';
		System.out.println(c);
		//A의 ascii값을 사용하고 싶은 경우
		int data = c; //int = char : 자동형변환
		System.out.println(data);

		//명시적 형변환
		//기본형에서 명시적 형변환 하는 사례
		byte bytedata = (byte)200; //원래 200은 int고 byte에 저장하는 거라서 에러.
		System.out.println(bytedata); // 이렇게 캐스팅하면 1bit가 1이되서 음수가 나오는것
										//이경우는 안씀.
		int intdata = 111;
		char chardata = (char)intdata; // int데이터를 char로 변환하는 경우.
		System.out.println(chardata);

		//115를 char로 명시적 캐스팅
		System.out.println((char)115);
		
		//int 연산을 double연산으로 바꾸는 경우에만 캐스팅을 하도록하자. ex)점유율
		double doubledata = (double)20/100*100;
		System.out.println(doubledata);

	
		}

}