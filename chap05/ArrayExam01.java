package chap05;
/*-int형 배열작성
-요소의 갯수: 10
-2번, 3번, 5번 요소에 100, 200, 300 각각 초기화
- 모든 요소값 출력하기*/
public class ArrayExam01 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[2] = 100;
		arr[3] = 200;
		arr[5] = 300;
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
