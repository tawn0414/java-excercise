package chap03;

import java.util.Random; /*// new Random()���� Ŭ�����ȿ� ģ �� 
							ctrl+shift+o*/

public class APIExam {
	public static void main(String[] args) {
	Random rand = new Random();
	int r =rand.nextInt(100);
	System.out.println("������ => "+(r+1));
	
	r = rand.nextInt();
	System.out.println("������ => "+r);

	}

}

/*<����>
1) RandomŬ������ �̿��ؼ� �۾�
	- nextInt�޼ҵ� ȣ���ؼ� �������� ���.*/