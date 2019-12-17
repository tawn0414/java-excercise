package chap09.api.lang;
//StringBufferTest
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		System.out.println("원본=>"+sb);
		
		sb.append("재밌다");//맨 끝에 추가하는 작업
		System.out.println("원본=>"+sb);
		sb.insert(2, "자바");//2번 index위치에 문자열을 추가하는 작업
		System.out.println("원본=>"+sb);
		sb.delete(2, 6);//2번째에서 5번째까지의 index를 삭제.
		System.out.println("원본=>"+sb);
		sb.reverse();//문자열의 순서를 거꾸로 바꾼다
		System.out.println("원본=>"+sb);
	}

}
