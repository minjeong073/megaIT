package academy.java2.construct.test02;

public class Test02 {
	public static void main(String[] args) {
		
		Student student1 = new Student("김민정", "@@대학교", "010-0000-1111", "java");
		
		student1.printInfo();
		
		student1.changeUniv("##대학교");
		student1.printInfo();
		
		student1.sendMessage();
		student1.sendMessage("잘하자!");
		System.out.println();
		
		
		Galaxy galaxy = new Galaxy("12345678");
		
		galaxy.setPhoneNumber("010-1111-2222");
		
		System.out.println("전화 번호 : " + galaxy.getPhoneNumber());
		System.out.println("일련 번호 : " + galaxy.getSerialNumber());
		
		galaxy.call("010-2222-3333");
		galaxy.message("010-3333-4444", "안녕?");
		
	}
}
