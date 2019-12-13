package oop.chap07.poly;
//선생님 블로그 다형성 연습2
public abstract class Beverage {
	private String name;
	protected int price;
	
	public Beverage() {
		
	}
	public Beverage(String name) {
		this.name = name;
	}
	public abstract void calcPrice();
	public void print() {
		System.out.println("음료: "+name+"이며, 가격은 "+price);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
