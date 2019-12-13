package oop.chap07;

public class DessertTest {
	public static void main(String[] args){
		Dessert coffee = new Dessert("�Ƹ޸�ī��",4500,5);
		Dessert tea = new Dessert("���Ƽ",3800,1);
		IceCream ice = new IceCream("���Ѹ�", 5000, 2, 310);
		
		System.out.println("*****�� �� �� ǥ ***** ");
		Dessert.print();//Ŭ�����̸����� �������ϰ� ����.(=static), ��ü �������ϰ� Static�޸𸮿��� �ٷ� ������ ������ �ǵ�.
		coffee.printProductInfo();//��ü���������� �������ϰ�����.(=non-static�̶�� ��)
		tea.printProductInfo();
		System.out.println();
		
		IceCream.print();
		ice.printProductInfo(); //Return�� ����. ȣ���ϰ� �������ϱ�.
		
		int sum = coffee.getTotalPrice()//return�� ����. ȣ���ϰ� ���� �޾Ƽ� Ȱ���ϴϱ�.
				  + tea.getTotalPrice()
				  + ice.getTotalPrice();
		
		System.out.println();
		System.out.println("*** �ѱݾ� " + sum + "�� ***");
		
	}
}
