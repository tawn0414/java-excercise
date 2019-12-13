package oop.chap07;

public class DessertTest {
	public static void main(String[] args){
		Dessert coffee = new Dessert("아메리카노",4500,5);
		Dessert tea = new Dessert("허브티",3800,1);
		IceCream ice = new IceCream("나뚜르", 5000, 2, 310);
		
		System.out.println("*****매 출 전 표 ***** ");
		Dessert.print();//클래스이름으로 엑세스하고 있음.(=static), 객체 생성안하고 Static메모리에서 바로 가져다 쓰려는 의도.
		coffee.printProductInfo();//객체참조변수로 엑세스하고있음.(=non-static이라는 뜻)
		tea.printProductInfo();
		System.out.println();
		
		IceCream.print();
		ice.printProductInfo(); //Return값 없음. 호출하고 끝냈으니까.
		
		int sum = coffee.getTotalPrice()//return값 있음. 호출하고 값을 받아서 활용하니까.
				  + tea.getTotalPrice()
				  + ice.getTotalPrice();
		
		System.out.println();
		System.out.println("*** 총금액 " + sum + "원 ***");
		
	}
}
