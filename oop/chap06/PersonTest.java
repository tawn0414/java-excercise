package oop.chap06;
//PersonŬ������ ����ϴ� Ŭ����
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person(); //heap�� Person�̶�� ��ü�� �����ǰ�
		                          //name, age, addr�� ����Ǿ� �ִ�.
		p1.setName("�嵿��");
		p1.setAddr("�����");
		p1.setAge(45); //age������ private���� ����Ǿ������Ƿ� 
		             //���� ��Ű���� Ŭ���������� ������ �� ����.
		System.out.println("����: "+p1.getName());
		System.out.println("�ּ�: "+p1.getAddr());
		System.out.println("����: "+p1.getAge());
		
		//���� ���� PersonŬ������ ���û�� ����. heap�� Person�̶�� ��ü�� �ѹ� �� ������.
		Person p2 = new Person(); 
		p2.setName("�嵿");
		p2.setAddr("����");
		p2.setAge(4); 
		System.out.println("����: "+p2.getName());
		System.out.println("�ּ�: "+p2.getAddr());
		System.out.println("����: "+p2.getAge());

	}

}
