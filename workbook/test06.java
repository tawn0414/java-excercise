package workbook;
//��ũ�� 25�� ����6�� get, set���.
public class test06 {

	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		
		stu1.setName("Kim");
		stu2.setName("Lee");
		stu3.setName("Park");
		stu1.setKorean(100);
		stu2.setKorean(60);
		stu3.setKorean(68);
		stu1.setEnglish(90);
		stu2.setEnglish(70);
		stu3.setEnglish(86);
		stu1.setMath(95);
		stu2.setMath(99);
		stu3.setMath(60);
		stu1.setScience(89);
		stu2.setScience(98);
		stu3.setScience(40);
		
		/*System.out.println(stu1.getName()+" ���:"+stu1.getAvg()+" ����:"+stu1.getGrade());
		System.out.println(stu2.getName()+" ���:"+stu2.getAvg()+" ����:"+stu2.getGrade());
		System.out.println(stu3.getName()+" ���:"+stu3.getAvg()+" ����:"+stu3.getGrade());
		*/
		stu1.print();
		stu2.print();
		stu3.print();
	}

}
