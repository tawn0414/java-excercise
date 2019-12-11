package oop.chap06;
//Ŭ������ �����ϰ� ��������� �����ϴ� ���.
//��������� ������ �� ���� �����ڸ� �߰��ؼ� ������ ������ �� �ִ�. ���������� ���� �����
//�������⼭ �� ������ �� �����ϱ� ������ ����ϴ�.
//	public
//	default
//	protected
//	private
//Ŭ������ ������ �� ��������� private���� �����ؼ� �ܺο��� ������ �� ������ ������
//�����ϰ� public�޼ҵ带 ���ؼ� ������ �� �ֵ��� �����Ѵ�.
public class Person {
/*
Ŭ������ ��ǥ�ϴ� ������, ���ݱ����� main�ȿ� ��������.
Ŭ������ Ư���� ��Ÿ���� ������: ������� or �ʵ�
��������� Ư���� ��Ȳ�� �ƴϸ� �ʱⰪ�� ���� �ʴ´�.
�ʱⰪ�� �������� �ʾƵ� �������� null, �������� 0, �Ǽ����� 0.0, boolean�� false�̴�.
������ Ÿ���� �⺻��, ������ ��� �� �� �ִ�.
*/
	private String name;
	private String addr;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	
	//��� ��������� private���� ����Ǿ� �ֱ� ������ ���� �����ϴ� �޼ҵ��
	//���� ������ �� �ִ� �޼ҵ尡 �ʿ��ϴ�.
	//�̷� ������ �ϴ� �޼ҵ带 �����ϴ� ���
	
	//private�� ���� ��������� set(������ ���� �����̳� ����)�̶� get���� ����.
	//name������ ���� �����ϴ� �޼ҵ�(set, set�� return Ÿ���� void,�Ű������� �ִ�.)
	//�޼ҵ�� : set + ���������(��, ù���ڸ� �빮�ڷ� �ٲ���Ѵ�.)
	//		  setName
	public void setName(String name) {//setter�޼ҵ�
		this.name = name; //this: �������, �캯: �Ű�����
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	//name������ ����� ���� ȣ���ϴ� ������ �Ѱ��� �޼ҵ�(get)
	//get�� ���� �Ű������� ���� �׻� return���� �ִ�.
	//�޼ҵ��: get+���������(��, ù���ڸ� �빮�ڷ� �ٲ���Ѵ�.)
	//        getName
	public String getName() {//getter�޼ҵ�: ���� ����ö� ���� �޼ҵ�
		return this.name; //�׳� name�� �ᵵ ��.
	}
	public String getAddr() {
		return this.addr;
	}
	public int getAge() {
		return this.age;
	}

	@Override//source�� �߰���.
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
}
