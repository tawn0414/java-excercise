package chap05;
//��ũ�� 15�� ����8��
public class ArrayExam02 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;//������ ������ ����
		
		for(int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("�� = "+sum);
		System.out.println("��� = "+(sum/arr.length));
	}

}
