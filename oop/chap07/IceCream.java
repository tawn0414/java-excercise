package oop.chap07;

public class IceCream extends Dessert{
	private int calorie;//Į�θ�
	
	public IceCream() {
		
	}

	public IceCream(String productName, int price, int count, int calorie) {
		super(productName, price, count);
		this.calorie = calorie;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	public static void print() {
		System.out.println("============================");
		System.out.println("�ֹ��׸�"+"\t"+"����"+"\t"+"����"+"\t"+"Į�θ�");
		System.out.println("============================");
	}
	public void printProductInfo() {
		System.out.println(getProductName()+"\t"+getPrice()+"\t"+getCount()+"\t"+getCalorie()+"kcal");
	}
}
