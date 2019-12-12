package oop.chap07;
//��ũ�� 25�� ����6��
public class Student extends Person{
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {
		
	}
	
	public Student(String name, int korean, int english, int math, int science) {
		//super();
		//this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	public Student(String name, int age, int korean, int english, int math, int science) {
		super(name,age);//�θ��� private����� name,age�� ���� ���������� �ʰ� �����ڸ� ȣ���Ͽ� �����Ѵ�.
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	public int getKorean() {
		return this.korean;
	}
	public int getEnglish() {
		return this.english;
	}
	public int getMath() {
		return this.math;
	}
	public int getScience() {
		return this.science;
	}
	
	public double getAvg() {
		double avg = 0;
		avg = (double)(this.korean+this.english+this.math+this.science)/4;
		return avg;
	}
	
	public String getGrade() {//���� Ŭ������ getAvg�� ����Ǿ� �����ϱ� �� ������ �ᵵ��.
		String grade;
		if (getAvg()<= 100 & getAvg()>= 90) {
			grade = "A����";
		}else if (getAvg()<90 & getAvg()>=70) {
			grade = "B����";
		}else if (getAvg()<70 & getAvg() >=50) {
			grade = "C����";
		}else if (getAvg()<50 & getAvg()>= 30) {
			grade = "D����";
		}else {
			grade = "F����";
		}
		return grade;
	}
	public void print() {
		//print();//�θ�Ŭ������ PersonŬ������ print�޼ҵ带 ȣ��. �ٵ� print()�� �̸��� ������ ���� ������ ȣ���ϴϱ� �޸𸮸� �����ϰԵ�.=>error
		super.print();//super�� �θ� ����Ŵ.
		System.out.println(" ���:"+getAvg()+" ����"+getGrade());
	}
	

}
