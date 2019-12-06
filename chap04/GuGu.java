package chap04;

//2단부터 9단까지
public class GuGu {

	public static void main(String[] args) {
		for (int j = 2; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				int num = j * i;
				System.out.print(j + "*" + i + "=" + num + "\t");
			}
			System.out.println();
		}
	}

}
