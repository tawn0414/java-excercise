package chap03;
//비교연산자: ||, &&(숏컷 연산자) : 모든 항을 검사하지 않고 조건에 만족하면
//							  skip하는 경우가 발생한다.
public class OprTest04_Short {

	public static void main(String[] args) {
		int num = 100;
		String str = null;//현재 str은 아무것도 저장되지 않은 변수
		//str.length(); => 이건 error나옴.
		System.out.println(num>=100 || str.length()>10);
		System.out.println(num>=100 | str.length()>10);
//      |나 &는 두개 다 검사함. ||나 &&는 수행속도를 줄이기 위해 앞에꺼만 보고
//      확정할 수 있으면 뒤에꺼는 검사를 안한다.
		
		System.out.println(num<100 & str.length()>10);
		System.out.println(num<100 & str.length()>10);
	}

}
