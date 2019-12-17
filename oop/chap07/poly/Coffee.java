package oop.chap07.poly;
//������ ��α� ������ ����2
public class Coffee extends Beverage{
	static int amount;
	
	public Coffee() {
		
	}
	public Coffee(String name) {//�ֹ��� ������ ���������� ���ݰ���� �̷������Ѵ�.
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

	/*static����� �������ϱ� ���ؼ� static�޼ҵ带 �����ؼ� �������Ѵ�.
	 public int getAmount() {
		return amount;
	}
	*/

	/*public void setAmount(int amount) { 
		this.amount = amount;
	} static�̶� this�� �Ұ����ϴ�.
	*/
	
}
