package oop.chap06.constructor;
//������ �����Ѱ� �ҷ��� ���.
public class MyconstructorTest {
	public static void main(String[] args) {
		//�⺻ �����ڸ� ȣ���ؼ� ��ü�� ������ �� setter�޼ҵ带 �̿��ؼ� ���� �ʱ�ȭ�ϱ�
		Myconstructor obj = new Myconstructor();
		obj.setName("kk");
		obj.setId("jang");
		obj.setPass("1234");
		System.out.println(obj.getName()+","+obj.getId()+","+obj.getPass());
		System.out.println("------------------------------------");
		//�Ű������� �ִ� ������ �޼ҵ带 ȣ���ϸ鼭 ���� �ʱ�ȭ�ϱ�.
		//Myconstructor(String,String,String)�����ڰ� ȣ��� ��.
		Myconstructor obj2 = new Myconstructor("gg", "ee", "hg");
		System.out.println(obj2.getName()+","+obj2.getId()+","+obj2.getPass());
		System.out.println("------------------------------------");
		//Myconstructor(String,String,String,String)�����ڰ� ȣ��� ��.
		Myconstructor obj3 = new Myconstructor("gg", "ee", "hg","ss");
		System.out.println(obj3.getName()+","+obj3.getId()+","+obj3.getPass()+","+obj3.getNickname());
		//Myconstructor(String,String,String,String,String,int)�����ڰ� ȣ��� ��.
				Myconstructor obj4 = new Myconstructor("gg", "ee", "hg","ss","����",1000);
				System.out.println(obj4.getName()+","+obj4.getId()+","+obj4.getPass()+","+obj4.getNickname());
	}
}