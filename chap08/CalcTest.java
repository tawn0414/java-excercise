package chap08;
//워크북 67
public class CalcTest {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		//int num2 = Integer.parseInt(args[1]); 지금은 이렇게 해도 되는데 문제에서 연산기호 입력하라했으니까 밑에처럼하기!
		int num2 = Integer.parseInt(args[2]);
		Calculator obj = new Calculator();
		System.out.println("결과: "+obj.divide(num1,num2));
	}

}
