package workbook;
//��ũ�� 55�� ����2��
public class Test02 {
	public static void main(String[] args) {
	double num = Double.parseDouble(args[0]);	
		company com = new company(num);
	System.out.println("�� �⺻�� ��: "+com.getIncome()+" ����: "+com.getAfterTaxIncome());
	System.out.println("�� ���ʽ� ��: "+com.getBonus()+" ����: "+com.getAfterTaxBonus());
	System.out.println("�� ���޾� ��: "+com.getAnnualIncome());
	}
}