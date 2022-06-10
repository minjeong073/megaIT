package academy.java2.polymorphism.test02;

public class Test02 {

	public static void main(String[] args) {
		
		Shape[] shape = new Shape[3];
		
		shape[0] = new Triangle(8, 10);
		shape[1] = new Rectangle(7,13);
		shape[2] = new Circle(12);
		
		for (int i = 0; i < shape.length; i++) {
//			System.out.println(printArea(shape[i]));
// 			printAreas(shape[i]);
// 			printShapeArea(shape[i]);
			shape[i].printArea();
		}
		
	}
	
	public static void printShapeArea(Shape shape) {
		System.out.println(shape.getName() + "의 넓이는 " 
				+ shape.getArea() + "cm^2 입니다.");
	}
	
// 	public static String printArea(Shape shape) {
// 		String str = null;
// 		if (shape instanceof Triangle) {
// 			str = "삼각형";
// 		} else if (shape instanceof Rectangle) {
// 			str = "사각형";
// 		} else if (shape instanceof Circle) {
// 			str = "원";
// 		}
// 		return str + "의 넓이는 " + shape.area() + "cm^2 입니다.";
// 	}
	
// 	public static void printAreas(Shape shape) {
// 		if (shape instanceof Triangle) {
// 			Triangle triangle = (Triangle) shape;
// 			triangle.printArea();
// 		} else if (shape instanceof Rectangle) {
// 			Rectangle rectangle = (Rectangle) shape;
// 			rectangle.printArea();
// 		} else if (shape instanceof Circle) {
// 			Circle circle = (Circle) shape;
// 			circle.printArea();
// 		}
// 	}
}
