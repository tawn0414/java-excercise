package chap05;
//javaÃ¥ 196ÂÊ ¿¹Á¦ 5-5
public class ArrayExam08 {
	public static void main(String[] args) {
		int sum = 0;
		float avg = 0f;
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i = 0; i<score.length; i++) {
			sum = sum+score[i];
		}
		avg = (float)sum/score.length;
		System.out.println("ÃÑÇÕ = "+sum);
		System.out.println("Æò±Õ = "+avg);

	}

}
