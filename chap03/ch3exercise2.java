package chap03;

public class ch3exercise2 {
	public static void main(String[] args) {
		int numOfApples = 123; //����� ����
		int sizeOfBucket = 10; //�ٱ��Ͽ� ���� �� �ִ� ����� ����
		int numOfBucket =(numOfApples%sizeOfBucket)==0?(numOfApples/sizeOfBucket):(numOfApples/sizeOfBucket+1);
		
		System.out.println("�ʿ��� �ٱ����� ��: "+numOfBucket);

	}

}
