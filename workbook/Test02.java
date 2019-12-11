package workbook;
//워크북 55쪽 문제2번
public class Test02 {
	public static void main(String[] args) {
	double num = Double.parseDouble(args[0]);	
		company com = new company(num);
	System.out.println("연 기본급 합: "+com.getIncome()+" 세후: "+com.getAfterTaxIncome());
	System.out.println("연 보너스 합: "+com.getBonus()+" 세후: "+com.getAfterTaxBonus());
	System.out.println("연 지급액 합: "+com.getAnnualIncome());
	}
}