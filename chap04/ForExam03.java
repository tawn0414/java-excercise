package chap04;
/*1���� 100������ ��,Ȧ����,¦���� ���ϱ�
[�������]
��:
Ȧ����:
¦����:*/
public class ForExam03 {
	public static void main(String[] args) {
		//��ü��
		int sum = 0;
		int oddsum = 0;
		int evensum = 0;
		
		for(int i = 1; i<=100; i++) {
			sum = sum+i;
			if(i%2==0) {
				evensum = evensum+i;
			}else{
				oddsum = oddsum+i;
			}
		}
		System.out.println("��ü�� = "+sum);
		System.out.println("¦���� = "+evensum);
		System.out.println("Ȧ���� = "+oddsum);
	}
	

}
