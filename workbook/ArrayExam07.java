package workbook;

import java.util.Random;

//况农合 23率 巩力4锅
public class ArrayExam07 {
	public static void main(String[] args) {
		int[] arr3 = new int[5];
		int sum = 0;
		double avg = 0;
		double count = 0;
		Random key = new Random();
		
		for(int i = 0; i<arr3.length; i++) {
			int rand = key.nextInt(10)+1;
			arr3[i] = rand;
			sum = sum + arr3[i];
			System.out.print(arr3[i]+"\t");
			count++;
		}
		System.out.println();
		avg = (double)sum/count;
		System.out.println("sum = "+sum);
		System.out.println("avg = "+avg);
	}

}
