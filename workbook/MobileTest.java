package workbook;
//��ũ�� 60��
public class MobileTest {
	public static void main(String[] args) {
		Ltab M1 = new Ltab("Ltab",500,"AP-01");
		Otab M2 = new Otab("Otab",1000,"AND-20");
		System.out.println("Mobile"+"\t"+"Battery"+"\t"+"OS"+"\t");
		System.out.println("--------------------------------------");
		System.out.println(M1.getMobileName()+"\t"+M1.getBatterySize()+"\t"+M1.getOsType());
		System.out.println(M2.getMobileName()+"\t"+M2.getBatterySize()+"\t"+M2.getOsType());
		System.out.println();
		System.out.println("10�� ����");
		System.out.println("Mobile"+"\t"+"Battery"+"\t"+"OS"+"\t");
		System.out.println("--------------------------------------");
		System.out.println(M1.getMobileName()+"\t"+M1.charge(10)+"\t"+M1.getOsType());
		System.out.println(M2.getMobileName()+"\t"+M2.charge(10)+"\t"+M2.getOsType());
		System.out.println();
		System.out.println("5�� ��ȭ");
		System.out.println("Mobile"+"\t"+"Battery"+"\t"+"OS"+"\t");
		System.out.println("--------------------------------------");
		System.out.println(M1.getMobileName()+"\t"+M1.operate(5)+"\t"+M1.getOsType());
		System.out.println(M2.getMobileName()+"\t"+M2.operate(5)+"\t"+M2.getOsType());
	}

}
