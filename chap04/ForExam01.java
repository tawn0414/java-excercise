package chap04;
//ABCDEF........Z
public class ForExam01 {
	public static void main(String[] args) {
		System.out.println((char)65);
		System.out.println((int)'Z');
		for(int i =65; i<=90;i++ ) {
			System.out.print((char)i);
		}
		System.out.println();
		for(char data = 'A';data<='Z';data++) {
			System.out.print(data);
		}
	}

}
