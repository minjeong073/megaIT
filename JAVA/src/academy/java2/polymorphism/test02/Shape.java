package academy.java2.polymorphism.test02;

public class Shape {
	
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double getArea() {	
		return 0;
	}
	
	public void printArea() {
		System.out.println(this.name + "의 넓이는 " 
			+ this.getArea() + "cm^2 입니다.");
	}
	// 재정의 하는 순간 부모 클래스의 메서드는 없어지게 됨
	// 부모 클래스에서 빈 메서드를 호출해도 자식 클래스에서 재정의된 메서드 값이 리턴됨
}
