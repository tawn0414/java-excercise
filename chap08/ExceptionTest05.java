package chap08;
//API�� �޼ҵ带 ȣ���ϴ� ���
//1. API�� �޼ҵ带 ����� �� ����ο� throws�� �߰��Ǿ� ������ �ݵ�� try~catch�� ó���ؾ� �Ѵ�.
//2. �޼ҵ尡 RuntimeExeption�� ���� Exception�� throws�ϴ� ��쿡�� ���������� Exception�� ���� ó���� �ϵ��� �������� �ʴ´�.
//   => �������δ� ���ѵǾ����� �ʾƵ� Exception�� throws�ϰ� ������ ����ó���� ������Ѵ�.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest05 {
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("test.txt");// test.txt��� ������ �������� �۾�. �ٵ� test.txt��� ������ ���� ���ɼ��� �־ API���� throws�� ���ܿ� ���� ��� ���ְ��ִ�. �̷� ��쿡�� �ݵ�� ����ó���� ������Ѵ�.
			System.out.println(fs.read());
			System.out.println(Integer.parseInt("1234"));//2�� ����.
			//System.out.println(Integer.parseInt("���ڿ�"));
		}
		catch(FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			//���߿��� ������ �ٽ� ������ �� �ֵ��� ó��.
		}catch(IOException e) {
			System.out.println("������ ���� �� ������ �߻��߽��ϴ�.");
		} 
	}

}
