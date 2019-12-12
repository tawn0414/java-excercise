package workbook;
//워크북 55쪽 문제2번
public class CompanyTest {
	public static void main(String[] args) {
	//com의 salary가 double이고 입력받은 salary가 int라서 자동 casting이 된다.
		int salary = Integer.parseInt(args[0]);	
		company com = new company(salary);
	System.out.println("연 기본급 합: "+com.getIncome()+" 세후: "+com.getAfterTaxIncome());
	System.out.println("연 보너스 합: "+com.getBonus()+" 세후: "+com.getAfterTaxBonus());
	System.out.println("연 지급액 합: "+com.getAnnualIncome());
	}
}