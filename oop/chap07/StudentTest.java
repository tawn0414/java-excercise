package oop.chap07;
//워크북 25쪽 문제6번 생성자 사용
public class StudentTest {
	public static void main(String[] args) {
		Student stu1 = new Student("Kim",25,100,90,95,89);
		Student stu2 = new Student("Lee",20,60,70,99,98);
		Student stu3 = new Student("Park",19,68,86,60,40);
		
		Teacher t1 = new Teacher("장동건",45,"Spring");
		Staff e = new Staff("김서연",25,"전산실");
		stu1.print();
		stu2.print();
		stu3.print();
		t1.print();
		e.print();
	}
}