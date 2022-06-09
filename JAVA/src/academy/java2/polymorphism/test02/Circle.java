package academy.java2.polymorphism.test02;

public class Circle extends Shape {

	private int radius;
	private double pi = 3.14;
		
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {	
		return radius * radius * pi;
	}
	
	@Override
	public void printArea() {
		System.out.println("원의 넓이는 " + area() + "cm^2 입니다.");
	}
	
}
