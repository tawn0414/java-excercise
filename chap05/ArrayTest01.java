package chap05;
//�迭�� ���� ����: ����ϴ� ���
public class ArrayTest01 {
	public static void main(String[] args) {
		//1. �迭�� ����
		int[] myarray;
		int[] myarray2;
		
		//2. �迭�� ����
		myarray = new int[5];
		myarray2 = new int[5];
		System.out.println(myarray);
		System.out.println(myarray2);
		System.out.println("myarray�� 2�� ����� �� = "+myarray[2]);
		
		//3. �迭�� �ʱ�ȭ
		myarray[2] = 100;
		System.out.println("myarray�� 2�� ����� �� = "+myarray[2]);
		
		//�迭�� ����� ������ �Ѳ����� ó��
		int[] numarray = new int[3];
		boolean[] boolarray = new boolean[5];
		long[] longarray = new long[100];
		double[] douarray = new double[100];
		
		/*�迭�� �⺻ �ʱⰪ
		�⺻���� ����� �ʱⰪ
		-������: 0
		-boolean: false
		-�Ǽ���: 0.0
		*/
		System.out.println(numarray[0]);
		System.out.println(boolarray[0]);
		System.out.println(longarray[0]);
		System.out.println(douarray[0]);
	}
}