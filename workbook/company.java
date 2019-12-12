package workbook;
//况农合 55率 巩力2锅
public class company {
	private double salary;//扁夯鞭
	private double annualIncome;//楷家垫
	private double afterTaxAnnualIncome;
	private double bonus;
	private double afterTaxBonus;
	
	public company() {
		
	}
	
	public company(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getAnnualIncome() {
		return getAfterTaxIncome()+getAfterTaxBonus();
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public double getAfterTaxAnnualIncome() {
		return afterTaxAnnualIncome;
	}

	public void setAfterTaxAnnualIncome(double afterTaxAnnualIncome) {
		this.afterTaxAnnualIncome = afterTaxAnnualIncome;
	}

	public double getBonus() {
		double result = 4*(this.salary/5.0);
		return result;
		
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getAfterTaxBonus() {
		double result = getBonus() - getBonus()*(5.5/100);
		return result;
	}

	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
	
	public double getIncome() {
		this.annualIncome = 12*this.salary;
		return this.annualIncome;
	}
	
	public double getAfterTaxIncome() {
		double result = getIncome()-(getIncome()/10);
		return result;
	}
	
	
	
}
