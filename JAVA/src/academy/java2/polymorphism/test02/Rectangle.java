package academy.java2.polymorphism.test02;

public class Rectangle extends Shape {
	
	private int width;
	private int height;
	
	
	public Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

// 	@Override
// 	public void printArea() {
// 		System.out.println("사각형의 넓이는 " + area() + "cm^2 입니다.");
// 	}
	
}
