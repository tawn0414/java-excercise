package chap04;

//continue: ����� ��ġ �Ʒ��� �ڵ带 skip�ϱ� ���� ���.
public class GuGu_Continue {

	public static void main(String[] args) {
		for (int j = 2; j <= 9; j++) {
			if (j == 5) {
				continue;
			}
			for (int i = 1; i <= 9; i++) {
				int num = j * i;
				System.out.print(j + "*" + i + "=" + num + "\t");
			}
			System.out.println();
		}
	}

}
