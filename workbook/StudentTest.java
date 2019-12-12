package workbook;

public class StudentTest {
	public static void main(String[] args) {
		Student2[] stu = new Student2[3];
		
		stu[0] = new Student2("홍길동",15,171,81);
		stu[1] = new Student2("한사람",13,183,72);
		stu[2] = new Student2("임걱정",16,175,65);
		
		System.out.println("이름"+"\t"+"나이"+"\t"+"신장"+"\t"+"몸무게");
		for(int i = 0; i<stu.length;i++) {
			System.out.println(stu[i].getName()+"\t"+stu[i].getAge()+"\t"+stu[i].getHeight()+"\t"+stu[i].getWeight());
		}
		double avg = (double)(stu[0].getAge()+stu[1].getAge()+stu[2].getAge())/stu.length;
		double height = (double)(stu[0].getHeight()+stu[1].getHeight()+stu[2].getHeight())/stu.length;
		double weight = (double)(stu[0].getWeight()+stu[1].getWeight()+stu[2].getWeight())/stu.length;
		System.out.println();
		System.out.println("나이의 평균: "+Math.round(avg*100)/100.0);
		System.out.println("신장의 평균: "+Math.round(height*100)/100.0);
		System.out.println("몸무게의 평균: "+Math.round(weight*100)/100.0);
	}
}