package academy.java2.map.test06;

public class Person {
	
	private String name;
	private int birthDay;
	
	
	public Person(String name, int birthDay) {
		this.name = name;
		this.birthDay = birthDay;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "이름 : " + this.name + " 생년월일 : " + this.birthDay;
	}
	
}
