package oop.chap07.poly;
public class SenderLogic {
	/*public void run(EmailSender obj) {
		
	}
	public void run(SMSSender obj) {
		
	}
	*///=> SenderTest���� Sender sender = null;�� ������ ��� ����ó�� �������� ��������. �̰� �ϸ� ���� Ŭ���� Ÿ������ �س����� �ڽĵ��� �� ������ �� �� �ִ�.
	public void run(Sender obj) {
		//SenderŬ������ Ŭ�������� Ȱ���ϴ� �޼ҵ�
		System.out.println("����Ϸ�");
		obj.print();//����Ŭ������ print()�� abstract��. => ����Ŭ���� �ΰ��� �������̵� �Ǿ�����.
	}
}
