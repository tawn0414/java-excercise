package oop.chap07.poly;
//선생님 블로그 다형성 연습2
public class Coffee extends Beverage{
	static int amount;
	
	public Coffee() {
		
	}
	public Coffee(String name) {//주문이 들어오면 수량증가와 가격계산이 이뤄져야한다.
		super(name);
		amount++;
		calcPrice();
	}
	public void calcPrice() {
		if(getName().equals("Cappuccino")) {
			setPrice(3000);
		}else if(getName().equals("CafeLatte")) {
			setPrice(2500);
		}else if(getName().equals("Americano")) {
			setPrice(1500);
		}
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) { 
		this.amount = amount;
	}
	
}
