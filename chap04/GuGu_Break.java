package chap04;

//break�� ����: break���� ����� ���� ����������.
public class GuGu_Break {

	public static void main(String[] args) {
		for (int j = 2; j <= 9; j++) {
			if (j == 5) {
				break;
			}
			for (int i = 1; i <= 9; i++) {
				/*
				  if(j==5) { break���� ���� for�� ����Ǿ� �����Ƿ�
			      break;     �ݺ����� ������� �ʴ´�. 
				  }
				 */
				int num = j * i;
				System.out.print(j + "*" + i + "=" + num + "\t");
			}
			System.out.println();
		}
	}

}
