package chap08;

import java.util.Scanner;
public class Prob1 {
	//�ʿ��� ��� ������ �޼��� ����κ�(�޼��� �ñ׳�ó)�� �����Ͻñ� �ٶ��ϴ�.
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("���ڷ� ��ȯ�� ���ڿ��� �Է¹ٶ��ϴ�.");
		String str= scan.nextLine();
		int result= 0;
		try {
			result = convert(str);
		}catch(IllegalArgumentException e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ� . ���ڿ��� �Է����� �ʰ� Enter Ű�� �����̽��ϴ�");
		}
		//try~catch�� ����ó��
	}

	//�ʿ��� ��� ������ �޼��� ����κ�(�޼��� �ñ׳�ó)�� �����Ͻñ� �ٶ��ϴ�.
	private static int convert(String str) throws IllegalArgumentException{
		int con = Integer.parseInt(str);	
		if (str == null | str.length()==0) {
				throw new IllegalArgumentException();
			}//if�� �߻��Ҷ� IllegalArgumentException(); �̷� ������ ����ϰڴ�. �ٵ� throws���� ������ ��� ������ ó������ �ѱ�ڴ�. try���� ����� �� ������ ���� catch���� �ְ� ������ ó���Ѵ�.

		return con;
	}
}