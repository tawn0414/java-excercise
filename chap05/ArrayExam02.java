package chap05;
//워크북 15쪽 문제8번
public class ArrayExam02 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;//총합을 저장할 변수
		
		for(int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("합 = "+sum);
		System.out.println("평균 = "+(sum/arr.length));
	}

}
