package chap09.api.lang;
//String객체를 다른 타입의 데이터로 변환하는 작업.
public class StringTest04 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("java oracle servlet jsp spring");
		//1. String -> byte[]
		byte[] data1 = str1.getBytes();
		for(int i = 0; i<data1.length;i++) {
			System.out.print(data1[i]+"\t");
		}
		System.out.println();
		//2. String -> char[], character하나하나를 배열로 엑세스해서 사용할 수 있다.
		char[] data2 = str1.toCharArray();
		for(int i = 0; i<data2.length;i++) {
			System.out.print(data2[i]+"\t");
		}
		System.out.println();
		//3. String -> String[]
		String[] data3 = str2.split(" ");//공백을 기준으로 자르겠다는 의미.
		for (String string : data3) {//data3이 배열, String타입의 string변수에 하나씩 꺼내서 담아서 동작시킴.
			System.out.print(string+"\t");
		}
		System.out.println();
		//4. 기본형 -> String
		int i = 1000;
		double d = 10.0;
		test(String.valueOf(i));//java.lang->String->valueOf
		test(String.valueOf(d));
		
		test(i+"");//valueOf써도 되고 이렇게 해도 됨.
		test(d+"");
	}
	public static void test(String data) {
		System.out.println("전달된 데이터=>"+data);
	}
}
