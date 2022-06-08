package academy.java2.inheritance.test01;

public class Test01 {

	public static void main(String[] args) {
		
		IPhone myPhone = new IPhone();
		
		myPhone.setNumber("010-1111-2222");
		
		System.out.println(myPhone.infoString());
		
		myPhone.internetBrowsing("https://www.google.com");
		myPhone.call("010-0000-0000");
		myPhone.sendMessage("010-2222-3333", "Hello!");
		
		
	}
}
