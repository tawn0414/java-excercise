package chap03;

public class ch3exercise2 {
	public static void main(String[] args) {
		int numOfApples = 123; //사과의 개수
		int sizeOfBucket = 10; //바구니에 담을 수 있는 사과의 개수
		int numOfBucket =(numOfApples%sizeOfBucket)==0?(numOfApples/sizeOfBucket):(numOfApples/sizeOfBucket+1);
		
		System.out.println("필요한 바구니의 수: "+numOfBucket);

	}

}
