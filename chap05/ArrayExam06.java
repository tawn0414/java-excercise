package chap05;
//��ũ�� 22�� ����3��
public class ArrayExam06 {
	public static void main(String[] args) {
		int [][] arr2 = {
							{5,5},
							{10,10,10,10,10},
							{20,20,20},
							{30,30,30,30}
						};
		int sum =0;
		double avg =0;
		double count =0;
		
		for(int j = 0; j<arr2.length; j++) {
			for(int i = 0; i<arr2[j].length;i++) {
				sum = sum + arr2[j][i];
				System.out.print(arr2[j][i]+"\t");
				count++;
			}
			System.out.println();
		}
		System.out.println(count);
		avg = sum/count;
		System.out.println("sum = "+sum);
		System.out.println("avg = "+avg);
	}

}
