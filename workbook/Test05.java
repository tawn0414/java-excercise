package workbook;
//워크북 24쪽 문제5번
public class Test05 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);//변수를 내가만든 클래스의 변수와 똑같이 a,b,c,d로 선언하자.
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		double avg = 0;
		
		Calc calc = new Calc();
		int sum = calc.calcSum(a, b, c, d);
		avg = (double)sum/args.length; //args.length가능!!
		
		System.out.println("sum: "+sum);
		System.out.println("Avg: "+avg);
		
		if (avg<= 100 & avg>= 90) {
			System.out.println("A학점");
		}else if (avg<90 & avg>=70) {
			System.out.println("B학점");
		}else if (avg<70 & avg >=50) {
			System.out.println("C학점");
		}else if (avg<50 & avg>= 30) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		
	}

}
