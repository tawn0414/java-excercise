package chap09.api.lang;
//StringŬ������ �⺻ �޼ҵ�� StringŬ������ Ư¡ ���캸��.
//=> ���ڿ�ó�� �޼ҵ带 ���� ȣ���ϰų� +�����ڷ� ���ڿ��� �����ϴ� �۾��� ���� ���
//=> String�� ������� �ʰ� StringBuffer�� StringBuilder�� ����Ѵ�.
public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("��մ�.");
		//������ȯ�� ���õ� �޼ҵ��(������ü�� ������ ����ȵ�, ������ �ٲ� �Ǵٸ� String��ü�� ����� ����.)
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase());//��ü�� �빮�ڷκ�ȯ
		System.out.println("����������:=>"+str1);
		System.out.println("str1.toLowerCase()=>"+str1.toLowerCase());//��ü�� �ҹ��ڷ� ��ȯ
		System.out.println("str1.substring(2)=>"+str1.substring(2));//2��° index���� return
		System.out.println("str1.substring(2,8)=>"+str1.substring(2,8));//2~7��° index�� return
		System.out.println("str1.replace('a','A')=>"+str1.replace('a','A'));//���ڿ��� a�� A�� ��ü
		System.out.println("����������:=>"+str1);//���������Ͱ� �״�� �����ȴ�.
		//���ڿ� ������ ����ϰ� �Ͼ�� �������� String�� ���� �ȵȴ�.(������ �ص� ������ �����Ǵϱ�, �޼ҵ� call�� ��ŭ ��ü�� ������� ��.) ��� StringBuffer�� StringBuilder�� ���.
		//StringBuffer�� threadó����(�������ӿ� ���� ���)�� �Ǿ�����.
		//StringBuilder�� threadó����(�������ӿ� ���� ���)�� �� �Ǿ�����.
	}
}