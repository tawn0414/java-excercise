package oop.chap07.poly;
public class SenderLogic {
	/*public void run(EmailSender obj) {
		
	}
	public void run(SMSSender obj) {
		
	}
	*///=> SenderTest에서 Sender sender = null;를 안했을 경우 위에처럼 여러개를 만들어야함. 이걸 하면 상위 클래스 타입으로 해놓으면 자식들은 다 가져다 쓸 수 있다.
	public void run(Sender obj) {
		//Sender클래스의 클래스들을 활용하는 메소드
		System.out.println("실행완료");
		obj.print();//상위클래스의 print()를 abstract함. => 하위클래스 두개가 오버라이딩 되어있음.
	}
}
