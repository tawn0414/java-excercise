package workbook;
//��ũ�� 21�� ����2��
public class ArrayExam04 {
	public static void main(String[] args) {
		int[][] arr2 = {
							{5,5,5,5,5},
							{10,10,10,10,10},
							{20,20,20,20,20},
							{30,30,30,30,30}
						};
		int sum = 0;
		double avg = 0.0;
		double denom = 0;
		
		for(int j = 0; j<arr2.length; j++) {
			for(int i = 0; i<arr2[j].length; i++) {
				sum = sum + arr2[j][i];
			}
			denom = arr2.length*arr2[j].length;
		}
		avg = sum/denom;
		System.out.println("total = "+sum);
		System.out.println("avg = "+avg);
		
		/* ������ Ǯ��.
		int count =1;
		for(int j = 0; j<arr2.length; j++) {
			for(int i = 0; i<arr2[j].length; i++) {
				sum = sum + arr2[j][i];
				count++;
			}
		}
		avg = (double)sum/count;
		*/
	}
}
