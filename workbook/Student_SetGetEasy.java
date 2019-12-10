package workbook;
//��Ŭ�� -> source -> generate getter and setter -> select all -> ok
public class Student_SetGetEasy {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	public double getAvg() {
		double avg = (double)(this.korean+this.english+this.math+this.science)/4;
		return avg;
	}
	
	public String getGrade() {//���� Ŭ������ getAvg()�� �����ϱ� new���ϰ� ���ᵵ��.
		double avg = getAvg();
		String grade = ""; //String ������ �ʱ�ȭ
		if (avg<= 100 & avg>= 90) {
			grade = "A����";
		}else if (avg<90 & avg>=70) {
			grade = "B����";
		}else if (avg<70 & avg >=50) {
			grade = "C����";
		}else if (avg<50 & avg>= 30) {
			grade = "D����";
		}else {
			grade = "F����";
		}
		return grade;
	}
	
	public void print() {
		System.out.println(getName()+" ���:"+getAvg()+" ����"+getGrade());
	}
	
}
