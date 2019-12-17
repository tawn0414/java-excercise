package chap08;
//API의 메소드를 호출하는 경우
//1. API의 메소드를 사용할 때 선언부에 throws가 추가되어 있으면 반드시 try~catch로 처리해야 한다.
//2. 메소드가 RuntimeExeption의 하위 Exception을 throws하는 경우에는 문법적으로 Exception에 대한 처리를 하도록 제한하지 않는다.
//   => 문법으로는 제한되어있지 않아도 Exception을 throws하고 있으면 예외처리를 해줘야한다.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest05 {
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("test.txt");// test.txt라는 파일을 열기위한 작업. 근데 test.txt라는 파일이 없을 가능성이 있어서 API에서 throws로 예외에 대한 경고를 해주고있다. 이런 경우에는 반드시 예외처리를 해줘야한다.
			System.out.println(fs.read());
			System.out.println(Integer.parseInt("1234"));//2번 내용.
			//System.out.println(Integer.parseInt("문자열"));
		}
		catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			//나중에는 파일을 다시 선택할 수 있도록 처리.
		}catch(IOException e) {
			System.out.println("파일을 읽을 때 오류가 발생했습니다.");
		} 
	}

}
