package chap04;
/*1부터 100까지의 합,홀수합,짝수합 구하기
[출력형태]
합:
홀수합:
짝수합:*/
public class ForExam03 {
	public static void main(String[] args) {
		//전체합
		int sum = 0;
		int oddsum = 0;
		int evensum = 0;
		
		for(int i = 1; i<=100; i++) {
			sum = sum+i;
			if(i%2==0) {
				evensum = evensum+i;
			}else{
				oddsum = oddsum+i;
			}
		}
		System.out.println("전체합 = "+sum);
		System.out.println("짝수합 = "+evensum);
		System.out.println("홀수합 = "+oddsum);
	}
	

}
