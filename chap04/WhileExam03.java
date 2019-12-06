package chap04;

//ForExam03을 while문으로 바꾸기
//1~100을 전체합,홀수합,짝수합.
public class WhileExam03 {
	public static void main(String[] args) {
		int sum = 0;
		int evensum = 0;
		int oddsum = 0;
		int i = 1;

		while (i <= 100) {
			sum = sum + i;
			if (i % 2 == 0) {
				evensum = evensum + i;
			} else {
				oddsum = oddsum + i;
			}
			i++;
		}
		System.out.println("전체합 = "+sum);
		System.out.println("짝수합 = "+evensum);
		System.out.println("홀수합 = "+oddsum);

	}

}
