package test.exam;
public class TimeExam{
	public static void main(String[] args){
		//time변수에 저장된 값은 초 데이터이다.
		//___시간 ___분 ___초의 형태로 출력하기
		int time = 8888;
		int minute =(time%3600)/60;
		int hours = time/3600;
		int sec = (time%3600)%60;

		System.out.println(hours+"시간"+minute+"분"+sec+"초");

	}
}