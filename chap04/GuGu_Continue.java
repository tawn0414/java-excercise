package chap04;

//continue: 선언된 위치 아래의 코드를 skip하기 위해 사용.
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
