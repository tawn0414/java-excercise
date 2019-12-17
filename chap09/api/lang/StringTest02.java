package chap09.api.lang;
//String클래스의 기본 메소드
public class StringTest02 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("재밌다.");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));//1번 index꺼니까 a
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));//두개의 문자열을 합침
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));//왼쪽부터 시작해서 a가 있는 index니까 1
		System.out.println("str1.indexOf('합')=>"+str1.indexOf('합'));//이런 문자열이 없을 때는 -1이 return됨.
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a'));//오른쪽부터 시작해서 a가 있는 index니까 10.
		System.out.println("str1.length()=>"+str1.length());
		//문자열 비교- 대소문자 구분함.
		System.out.println("str1.equals(\"java programming\")=>"+str1.equals("java programming"));//역 슬래쉬를 치면 큰따옴표로 인식하는게 아니고 큰따옴표를 문자로 인식한다.
		System.out.println("str1.equals(\"Java programming\")=>"+str1.equals("Java programming"));//equals는 대소문자도 구분한다.
		//문자열 비교- 대소문자 구분 안함.
		System.out.println("str1.equalsIgnoreCase(\"java programming\")=>"+str1.equalsIgnoreCase("Java programming"));//대소문자 비교안함.
		System.out.println("str1.equalsIgnoreCase(\"Java programming\")=>"+str1.equalsIgnoreCase("Java programming"));
		//문자열 비교- prefix
		System.out.println("str1.startsWith(\"java\")=>"+str1.startsWith("java"));
		System.out.println("str1.startsWith(\"Java\")=>"+str1.startsWith("Java"));//이런 문자열로 시작하는지. 대소문자 구분함.
		//문자열 비교- suffix
		System.out.println("str1.startsWith(\"ming\")=>"+str1.endsWith("ming"));//이런 문자열로 끝나는지
	
	}

}
