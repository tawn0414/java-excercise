package workbook;
//��ũ��14�� ����7��
public class ArrayExam05 {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = 0;
		System.out.println("�Է� = "+num1);
		
		for(int i = 1; i<=100; i++) {
			if((i %num1) ==0) {
				num2 = num2 + i;
				System.out.print(i+"+");
			}
		}
		System.out.println("="+num2);
	}

}
