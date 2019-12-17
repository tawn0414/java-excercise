package chap09.api.lang;
//String클래스의 기본 메소드와 String클래스의 특징 살펴보기.
//=> 문자열처리 메소드를 자주 호출하거나 +연산자로 문자열을 연결하는 작업이 많은 경우
//=> String을 사용하지 않고 StringBuffer나 StringBuilder를 사용한다.
public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("재밌다.");
		//원본변환에 관련된 메소드들(원본객체의 내용은 변경안됨, 원본을 바꾼 또다른 String객체를 만드는 것임.)
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase());//전체를 대문자로변환
		System.out.println("원본데이터:=>"+str1);
		System.out.println("str1.toLowerCase()=>"+str1.toLowerCase());//전체를 소문자로 변환
		System.out.println("str1.substring(2)=>"+str1.substring(2));//2번째 index부터 return
		System.out.println("str1.substring(2,8)=>"+str1.substring(2,8));//2~7번째 index를 return
		System.out.println("str1.replace('a','A')=>"+str1.replace('a','A'));//문자열의 a를 A로 대체
		System.out.println("원본데이터:=>"+str1);//원본데이터가 그대로 유지된다.
		//문자열 조작이 빈번하게 일어나는 곳에서는 String을 쓰면 안된다.(조작을 해도 원본이 유지되니까, 메소드 call한 만큼 객체가 만들어진 것.) 대신 StringBuffer나 StringBuilder를 써라.
		//StringBuffer는 thread처리가(동시접속에 대한 고려)잘 되어있음.
		//StringBuilder는 thread처리가(동시접속에 대한 고려)잘 안 되어있음.
	}
}