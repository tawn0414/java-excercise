package chap05;

import java.util.Random;

//�迭�� ����, ����, �ʱ�ȭ�� �Ѳ����� ó���ϴ� ���.
public class ArrayTest04 {
	public static void main(String[] args) {
		//�ٸ� ���� ������ ������� �����ϴ� ���: �߰�ȣ �� �޸��� �迭 ��Ҹ� �����Ѵ�.
		//int[] myarr = new int[5]�� �Ȱ��� �ǹ��̴�.
		int[] myarr = {10, 20, 30, 40, 50};
		System.out.println("�迭�� ����� ����: "+myarr.length);
		
		for(int i = 0; i<myarr.length; i++) {
			System.out.println(myarr[i]);
		}
		System.out.println("---------------------------");
		//�ڹ� ����� ����, ����, �ʱ�ȭ�� ��Ű�� ��������� ���� ����� �� ���� ��.
		int[] myarr2 = new int[] {10,20,30,40,50};
		System.out.println("�迭�� ����� ����: "+myarr2.length);
		
		for (int i = 0; i<myarr2.length; i++) {
			System.out.println(myarr2[i]);
		}
		System.out.println("---------------------------");
		//������ �迭�� ����, ����, �ʱ�ȭ�� �Ѳ�����
		String[] strArr = {new String("java"),
							new String("survlet"),
							new String("spring")};
		System.out.println("������ �迭�� ����: "+strArr.length);
		/*������ ������ �迭�̱� ������ ��ü�� �Ҵ�� ���� �ּҰ��� ��µǾ�� ������
		String�� ���ܿ��� java, survlet, spring�� ��µ� ���̴�.*/
		for(int i = 0; i<strArr.length; i++) {
			System.out.println("�迭 ��� = "+strArr[i]);
		}
		System.out.println("---------------------------");
		//Random�� �ּҷ� ����. ������ �̷��� �����°� ������.
		Random[] randArr = {new Random(), new Random()};
		for(int i = 0; i<randArr.length; i++) {
			System.out.println("�迭��� = "+randArr[i]);
		}
		System.out.println("---------------------------");
		//StringŬ������ ���� ���̾��� �������̱� ������ �⺻��ó�� ����� �� �ִ�.
		String[] strArr2 = {"java", "survlet", "spring","hadoop"};
		System.out.println("����: "+strArr2.length);
		for(int i = 0; i<strArr2.length; i++) {
			System.out.println(strArr2[i]);
		}
	}

}
