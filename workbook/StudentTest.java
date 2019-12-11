package workbook;

public class StudentTest {
	public static void main(String[] args) {
	Student2[] studentArray = new Student2[3];
	
	studentArray[0] = new Student2();
	studentArray[0].setName("È«±æµ¿");
	studentArray[0].setAge(15);
	studentArray[0].setHeight(171);
	studentArray[0].setWeight(81);
	
	studentArray[1] = new Student2();
	studentArray[1].setName("ÇÑ»ç¶÷");
	studentArray[0].setAge(13);
	studentArray[0].setHeight(183);
	studentArray[0].setWeight(72);
	
	studentArray[2] = new Student2();
	studentArray[2].setName("ÀÓ°ÆÁ¤");
	studentArray[0].setAge(16);
	studentArray[0].setHeight(175);
	studentArray[0].setWeight(65);
	
	for (int i = 0; i < studentArray.length; i++) {
		Student2 student2 = studentArray[i];
	}
	
	}
}
