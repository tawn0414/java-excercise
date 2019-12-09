package chap05;

public class ArgsTest {
	public static void main(String[] args) {
		/*
		args = new String[2]
						--------
						명령행 매개변수의 갯수만큼 설정
		args[0] = "100.0";
		args[1] = "200.5";
		*/
		//명령행 매개변수 2개를 입력 받겠다는 의미
		System.out.println("명령행 매개변수 -> "+args[0]);
		System.out.println("명령행 매개변수 -> "+args[1]);
		for(int i = 0; i<args.length;i++) {
			System.out.println(args[i]);
		}
		//System.out.println("합 =>"+(args[0]+args[1]));//String이라서 더하기가 안됨
		//int num1 = args[0]; // int = String 하는거랑 똑같은 거니까 안되는것
		//아래껀 String으로 입력받은 명령행매개변수를 int로 변환
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("합 => "+(num1+num2));
	}
}