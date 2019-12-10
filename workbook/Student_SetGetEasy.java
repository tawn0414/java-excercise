package workbook;
//우클릭 -> source -> generate getter and setter -> select all -> ok
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
	
	public String getGrade() {//같은 클래스에 getAvg()가 있으니까 new안하고 걍써도됨.
		double avg = getAvg();
		String grade = ""; //String 변수의 초기화
		if (avg<= 100 & avg>= 90) {
			grade = "A학점";
		}else if (avg<90 & avg>=70) {
			grade = "B학점";
		}else if (avg<70 & avg >=50) {
			grade = "C학점";
		}else if (avg<50 & avg>= 30) {
			grade = "D학점";
		}else {
			grade = "F학점";
		}
		return grade;
	}
	
	public void print() {
		System.out.println(getName()+" 평균:"+getAvg()+" 학점"+getGrade());
	}
	
}
