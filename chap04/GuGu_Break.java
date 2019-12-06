package chap04;

//break문 연습: break문이 선언된 블럭을 빠져나간다.
public class GuGu_Break {

	public static void main(String[] args) {
		for (int j = 2; j <= 9; j++) {
			if (j == 5) {
				break;
			}
			for (int i = 1; i <= 9; i++) {
				/*
				  if(j==5) { break문이 내부 for에 선언되어 있으므로
			      break;     반복문이 종료되지 않는다. 
				  }
				 */
				int num = j * i;
				System.out.print(j + "*" + i + "=" + num + "\t");
			}
			System.out.println();
		}
	}

}
