package chap05;
//javaå 196�� ���� 5-5
public class ArrayExam08 {
	public static void main(String[] args) {
		int sum = 0;
		float avg = 0f;
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i = 0; i<score.length; i++) {
			sum = sum+score[i];
		}
		avg = (float)sum/score.length;
		System.out.println("���� = "+sum);
		System.out.println("��� = "+avg);

	}

}
