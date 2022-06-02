package academy.java2.construct.test02;

public class Student {

	private String name;
	private String univ;
	private String phoneNumber;
	private String className;
	
	public Student(String name, String univ, String phoneNumber, String className) {
		this.name = name;
		this.univ = univ;
		this.phoneNumber = phoneNumber;
		this.className = className;
	}

	public void printInfo() {
		System.out.println(this.className + " 수업 : " 
				+ this.univ + " " + this.name + "학생");
	}

	public void changeUniv(String univ) {
		this.univ = univ;
		System.out.println(this.name + "님의 학교가 " + this.univ + "로 변경되었습니다.");
	}

	public void sendMessage() {
		System.out.println(this.name + "학생에게 (" + this.phoneNumber 
				+ ") 수업일정 메시지를 전송 합니다.");
	}

	public void sendMessage(String message) {
		System.out.println(this.name + "학생에게 (" + this.phoneNumber 
				+ ") " + message +" 라고 전송 합니다.");
	}

}
