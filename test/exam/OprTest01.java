package test.exam;
public class OprTest01{
	public static void main(String[] args) 
	{
		int x = 5;
		

		// y = x++
		int y = x++;
		System.out.println("x ="+ x);
		System.out.println("y ="+ y);
		
		x = 5;
		// y = ++x
		y = ++x;
		System.out.println("x ="+ x);
		System.out.println("y ="+ y);
		
		x = 5;
		// y = x--
		y = x--;
		System.out.println("x ="+ x);
		System.out.println("y ="+ y);
		
		x = 5;
		// y = --x
		y = --x;
		System.out.println("x ="+ x);
		System.out.println("y ="+ y);
	}
}
