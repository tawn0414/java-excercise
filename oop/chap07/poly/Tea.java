package oop.chap07.poly;
//선생님 블로그 다형성 연습2
public class Tea extends Beverage{
	static int amount;
	
	public Tea() {
		
	}
	public Tea(String name) {//주문이 들어오면 수량증가와 가격계산이 이뤄져야한다.
		super(name);
		amount++;
		calcPrice();
	}
	public void calcPrice() {
		if(getName().equals("lemonTea")) {
			setPrice(1500);
		}else if(getName().equals("ginsengTea")) {
			setPrice(2000);
		}else if(getName().equals("redginsengTea")) {
			setPrice(2500);
		}
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
