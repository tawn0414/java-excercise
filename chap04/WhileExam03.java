package chap04;

//ForExam03�� while������ �ٲٱ�
//1~100�� ��ü��,Ȧ����,¦����.
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
		System.out.println("��ü�� = "+sum);
		System.out.println("¦���� = "+evensum);
		System.out.println("Ȧ���� = "+oddsum);

	}

}
