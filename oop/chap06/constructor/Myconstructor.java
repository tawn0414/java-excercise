package oop.chap06.constructor;

//생성자 연습
public class Myconstructor {
	private String name;
	private String id;
	private String pass;
	private String nickname;
	private String addr;
	private int point;
	public Myconstructor(){
		System.out.println("기본생성자");
	}
	//생성자 명은 클래스명과 같아야한다.
	//멤버변수 순서와 똑같이 매개변수 여러개 있는 생성자 생성.=> 생성자 메소드 안에 생성자 메소드 호출.
	//로그인용
	public Myconstructor(String name, String id, String pass) {
		System.out.println("매개변수가 3개 있는 생성자");
		//멤버변수(인스턴스변수, 객체변수)를 초기화
		this.name = name;
		this.id = id;
		this.pass = pass;
	}
	//수정용
	public Myconstructor(String name, String id, String pass,String nickname) {
		this(name,id,pass); //기존에 작성해 놓은 매개변수가 3개 있는 생성자를 호출, 이 생성자 안에있는 내용들이 다 포함되는거.
		System.out.println("매개변수가 4개 있는 생성자");
		this.nickname = nickname;
	}
	//조회용
	public Myconstructor(String name, String id, String pass,String nickname, String addr) {
		this(name,id,pass,nickname);
		System.out.println("매개변수가 5개 있는 생성자");
		this.addr = addr;
	}
	//삽입용
	public Myconstructor(String name, String id, String pass,String nickname, String addr, int point) {
		this(name,id,pass,nickname,addr);
		System.out.println("매개변수가 6개 있는 생성자");
		this.point = point;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	
	
}
