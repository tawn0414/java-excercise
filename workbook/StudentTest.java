package workbook;

public class StudentTest {
	public static void main(String[] args) {
		Student2[] stu = new Student2[3];
		
		stu[0] = new Student2("ȫ�浿",15,171,81);
		stu[1] = new Student2("�ѻ��",13,183,72);
		stu[2] = new Student2("�Ӱ���",16,175,65);
		
		System.out.println("�̸�"+"\t"+"����"+"\t"+"����"+"\t"+"������");
		for(int i = 0; i<stu.length;i++) {
			System.out.println(stu[i].getName()+"\t"+stu[i].getAge()+"\t"+stu[i].getHeight()+"\t"+stu[i].getWeight());
		}
		double avg = (double)(stu[0].getAge()+stu[1].getAge()+stu[2].getAge())/stu.length;
		double height = (double)(stu[0].getHeight()+stu[1].getHeight()+stu[2].getHeight())/stu.length;
		double weight = (double)(stu[0].getWeight()+stu[1].getWeight()+stu[2].getWeight())/stu.length;
		System.out.println();
		System.out.println("������ ���: "+Math.round(avg*100)/100.0);
		System.out.println("������ ���: "+Math.round(height*100)/100.0);
		System.out.println("�������� ���: "+Math.round(weight*100)/100.0);
	}
}