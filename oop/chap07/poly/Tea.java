package oop.chap07.poly;
//������ ��α� ������ ����2
public class Tea extends Beverage{
	static int amount;
	
	public Tea() {
		
	}
	public Tea(String name) {//�ֹ��� ������ ���������� ���ݰ���� �̷������Ѵ�.
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
