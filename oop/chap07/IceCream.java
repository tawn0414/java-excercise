package oop.chap07;

public class IceCream extends Dessert{
	private int calorie;//칼로리
	
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
		System.out.println("주문항목"+"\t"+"가격"+"\t"+"수량"+"\t"+"칼로리");
		System.out.println("============================");
	}
	public void printProductInfo() {
		System.out.println(getProductName()+"\t"+getPrice()+"\t"+getCount()+"\t"+getCalorie()+"kcal");
	}
}
