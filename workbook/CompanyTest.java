package workbook;
//��ũ�� 55�� ����2��
public class CompanyTest {
	public static void main(String[] args) {
	//com�� salary�� double�̰� �Է¹��� salary�� int�� �ڵ� casting�� �ȴ�.
		int salary = Integer.parseInt(args[0]);	
		company com = new company(salary);
	System.out.println("�� �⺻�� ��: "+com.getIncome()+" ����: "+com.getAfterTaxIncome());
	System.out.println("�� ���ʽ� ��: "+com.getBonus()+" ����: "+com.getAfterTaxBonus());
	System.out.println("�� ���޾� ��: "+com.getAnnualIncome());
	}
}