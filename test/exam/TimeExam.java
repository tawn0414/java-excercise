package test.exam;
public class TimeExam{
	public static void main(String[] args){
		//time������ ����� ���� �� �������̴�.
		//___�ð� ___�� ___���� ���·� ����ϱ�
		int time = 8888;
		int minute =(time%3600)/60;
		int hours = time/3600;
		int sec = (time%3600)%60;

		System.out.println(hours+"�ð�"+minute+"��"+sec+"��");

	}
}