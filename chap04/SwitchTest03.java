package chap04;

//switch�������� �������
public class SwitchTest03 {
	public static void main(String[] args) {
		// switch�� ���ǹ��� int�� casting�� �� �ִ� ���� ����ִ� ����, �����, �޼ҵ� ȣ�⹮ ����ؾߵ�.
		//       -------------------
		//       byte, short, int, char, String ��밡��
		double d = 1.5;
		/*switch(d) {
		case 1.0:
		}*/
		int data = 5; //ASCII�ڵ�ϱ� ��밡��
		switch(data+60) {
			case 'A':
				System.out.println("A");
				break;
			case 'B':
				System.out.println("B");
		}
		
		//String�� referenceŸ�������� �⺻��ó�� ����� �� ����.
		String code = new String("a01");
		switch(code) {
			case "a01":
				System.out.println("A01");
				break;
			case "a02":
				System.out.println("A02");
		}
	}

}
