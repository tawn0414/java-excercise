package oop.chap07;
/*
 *  <<��Ӱ��迡�� �����ڰ� ���� Ư¡>>
 * 1. Ŭ������ ��� ������ �޼ҵ��� ù��° ���忡�� �θ�Ŭ������ �⺻ �����ڸ� ȣ���ϴ�
 *    ��ɹ��� �����Ǿ� �ִ�. (:super()�� �����Ǿ� �ִ�.)
 *    =>�θ�Ŭ������ �޸𸮿� �Ҵ�Ǿ�� ����� �� �����Ƿ�
 *    =>�θ��� �����ڸ� ȣ���ϴ� ����� super(...)
 *      super()�� �θ��� �Ű����� ���� �⺻������
 *      
 *    => �̹� �ٸ� �����ڸ� ȣ���ϴ� ��쿡�� super()�� �� �� ����.
 *       this()�� ȣ���ϴ� ��� super()�� ȣ���� �� ����.------------)_)
 * 2. ��� Ŭ������ �ֻ��� Ŭ������ java.lang.ObjectŬ�����̴�.
 * 	  => �ڹٿ��� ����Ǵ� ��� ��ü�� ���� ������ Ư¡�� ������ Ŭ������
 *       ��ӹް� �ִ� Ŭ������ ���� ��� �����Ϸ��� �ڵ����� ����ϵ��� �Ѵ�.
 * 3. �θ�Ŭ������ ���ǵǾ��ִ� ����������� �����ؾ��ϴ� ��쿡�� ����Ŭ�������� ���޵� ��
 *    �ֵ��� �����ؾ��Ѵ�.����Ŭ������ �����ִ� ������ ����Ŭ������ ���δ� �����޾ƾ��Ѵٴ� ��
 *    super(��1,��2,...)�� ���ؼ� �����ؾ��Ѵ�.
 *    -----------------
 *     �θ��� �Ű������� �ִ� �����ڸ� ȣ���ϴ� ���.
 */
class SuperA extends java.lang.Object{ //extends java.lang.Object �̰� ��ҿ� �����Ǿ��ִ�.
	private String name;
	private int age;
	SuperA(){
		super();
	}
	SuperA(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
class SubA extends SuperA{
	String addr;
	int point;
	SubA(){
		super();//��� �����ڸ޼ҵ��� ù ��° ���忡�� super()�� �����Ǿ�����.
	}
	SubA(String addr){
		super();
		this.addr = addr;
	}
	SubA(String addr, int point){
		this(addr);//�̹� ���ǵǾ��ִ� �Ǵٸ� �����ڸ� ȣ���� ��. )_)�̰� ����.
		this.point = point;
	}
	SubA(String name, int age,String addr, int point){
		super(name,age);//�θ��� �Ű����� 2�� �����ڸ� ȣ��, private�Ǿ��ִ� ��������� �������Ѱ�.
						//super(String,int)�� ȣ���� ��. => 3�� ����
		this.addr = addr;
		this.point = point;
	}
}

public class InheritanceTest03 {
	public static void main(String[] args) {
		SubA obj = new SubA("�����",1000);
		System.out.println(obj.name+","+obj.addr+","+obj.age+","+obj.point);
	}

}
