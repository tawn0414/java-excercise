package chap03; // chap03������ �����ϰ� �� �ȿ� APITest.class�� �����Ѵ�.

import java.io.File;
import java.util.Random;
//Ctrl+shift+o�� ������ �ڵ����� import��. ������� �ʴ� import���� ������.
/*import java.io.*; java.lang��Ű���� �⺻���� �ν��ϹǷ� �ٸ� ��Ű���� ����
					�ϴ� Ŭ������ ����ϴ°�� � ��Ű���� �ִ��� �νĽ�Ű��
					�۾��� �ؾ��Ѵ�.
                    import�� �� ��Ű�� ���� ��� ���������. *:���� �̶�� ��.
import java.util.*; //RandomŬ������ �νĽ�Ű�� �۾��� �� ��.
//API����ϱ� : ������ ���� ����
*/public class APITest {

	public static void main(String[] args) {
		/*1. API���� �����ϴ� Ŭ������ �ڹ� ���α׷� �ȿ��� ����ϱ� ���� �޸𸮿�
		String�� StringBuffer�� �ø��� �۾� => JVM�� �ν��ϴ� �۾� ������ �Ҵ�
		����� Ŭ������ ���� = new ����� Ŭ������()
		���⼭ ������ ����� Ŭ�������� ������ Ÿ������ ���ȴ�.*/
		String str = new String();
		StringBuffer sb = new StringBuffer();
		File file = new File("text.txt");
		Random rand = new Random();
		//ArrayList list = new ArrayList();
		
		//2. ��ü(Ŭ������ ����ϱ� ���� �޸𸮿� �÷����� ��=�ν��Ͻ�)�� �޼ҵ� ����ϱ�
		// charAt�� ���� ����� charŸ���̹Ƿ� ���� Ÿ���� ������ �����ؼ� ����
		String str2 = new String("fasd");
		char returnVal = str2.charAt(0); //0��° index�� �ٷ�� ��.
		System.out.println("������ => "+returnVal);
		
		/*//i love you��� ���ڿ��� �̿��ؼ� String��ü�� �����ϰ�
		�� ���ڿ��� ���̸� ������ ���� �������� ����ϼ���.
		���ڿ��� ���� =>_____ */
		
		String str3 = new String("i love you");
		int leng = str3.length();
		System.out.println("���ڿ��� ���� => "+leng);
		
	}

}