package chap09.api.lang;
//StringŬ������ �⺻ �޼ҵ�
public class StringTest02 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("��մ�.");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));//1�� index���ϱ� a
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));//�ΰ��� ���ڿ��� ��ħ
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));//���ʺ��� �����ؼ� a�� �ִ� index�ϱ� 1
		System.out.println("str1.indexOf('��')=>"+str1.indexOf('��'));//�̷� ���ڿ��� ���� ���� -1�� return��.
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a'));//�����ʺ��� �����ؼ� a�� �ִ� index�ϱ� 10.
		System.out.println("str1.length()=>"+str1.length());
		//���ڿ� ��- ��ҹ��� ������.
		System.out.println("str1.equals(\"java programming\")=>"+str1.equals("java programming"));//�� �������� ġ�� ū����ǥ�� �ν��ϴ°� �ƴϰ� ū����ǥ�� ���ڷ� �ν��Ѵ�.
		System.out.println("str1.equals(\"Java programming\")=>"+str1.equals("Java programming"));//equals�� ��ҹ��ڵ� �����Ѵ�.
		//���ڿ� ��- ��ҹ��� ���� ����.
		System.out.println("str1.equalsIgnoreCase(\"java programming\")=>"+str1.equalsIgnoreCase("Java programming"));//��ҹ��� �񱳾���.
		System.out.println("str1.equalsIgnoreCase(\"Java programming\")=>"+str1.equalsIgnoreCase("Java programming"));
		//���ڿ� ��- prefix
		System.out.println("str1.startsWith(\"java\")=>"+str1.startsWith("java"));
		System.out.println("str1.startsWith(\"Java\")=>"+str1.startsWith("Java"));//�̷� ���ڿ��� �����ϴ���. ��ҹ��� ������.
		//���ڿ� ��- suffix
		System.out.println("str1.startsWith(\"ming\")=>"+str1.endsWith("ming"));//�̷� ���ڿ��� ��������
	
	}

}
