package oop.chap07.poly;
//������ ��α� ������ ����1
public abstract class Content {
	private String title;
	private int price;
	
	public Content() {
		
	}

	public Content(String title) {
		super();
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public abstract void totalPrice();
	
	public void show() {
		System.out.println(this.title+"������ ������"+this.price+"�� �Դϴ�.");
	}
}
