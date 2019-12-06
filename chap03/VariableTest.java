package chap03;
//기본형과 참조형 변수의 비교
public class VariableTest {
	public static void main(String[] args) {
		//기본형 변수
		int i = 10;
		int j = 10;
		System.out.println("=========기본형=========");
		if(i == j) {
			System.out.println("기본형 같다.");
		}else {
			System.out.println("기본형 다르다.");
		}
		//참조형 변수: heap에 할당된 객체의 주소를 저장하는 변수.
		String str1 = new String("java");
		String str2 = new String("java");
		
		if(str1 == str2) {
			System.out.println("참조형 같다.");
		}else {
			System.out.println("참조형 다르다. => 주소가 다르니까.");
		}	
		//문자열 비교 = String클래스 메소드로 처리, equals은 객체를 비교하는 것.
		boolean result = str1.equals(str2);
		if(result) {
			System.out.println("문자열 같다.");
		}else {
			System.out.println("문자열 다르다.");
		}
	}
}
