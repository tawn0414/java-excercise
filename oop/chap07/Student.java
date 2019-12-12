package oop.chap07;
//워크북 25쪽 문제6번
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
		super(name,age);//부모의 private멤버인 name,age를 직접 엑세스하지 않고 생성자를 호출하여 전달한다.
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
	
	public String getGrade() {//같은 클래스에 getAvg가 선언되어 있으니까 걍 가져다 써도됨.
		String grade;
		if (getAvg()<= 100 & getAvg()>= 90) {
			grade = "A학점";
		}else if (getAvg()<90 & getAvg()>=70) {
			grade = "B학점";
		}else if (getAvg()<70 & getAvg() >=50) {
			grade = "C학점";
		}else if (getAvg()<50 & getAvg()>= 30) {
			grade = "D학점";
		}else {
			grade = "F학점";
		}
		return grade;
	}
	public void print() {
		//print();//부모클래스인 Person클래스의 print메소드를 호출. 근데 print()가 이름이 같으면 가장 가까운걸 호출하니까 메모리만 낭비하게됨.=>error
		super.print();//super는 부모를 가르킴.
		System.out.println(" 평균:"+getAvg()+" 학점"+getGrade());
	}
	

}
