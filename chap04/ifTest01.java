package chap04;

import java.util.Random;
//if���� RandomŬ���� �����ϱ�.
public class ifTest01 {
	public static void main(String[] args) {
		//random�� nextInt�� �̿��ؼ� 1���� 100������ ���� �߻���Ų �� �۾�.
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		if(num>=90) {
			System.out.println("num = "+num);
			System.out.println("�հ�");
		}
			System.out.println("����");
	}
}

