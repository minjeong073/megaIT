package academy.java2.Class;

public class Circle {
	
	int radius;
	double pi = 3.14;
	
	double calculateArea() {
		return radius * radius * pi;
	}
	
	double calculateCircumference() {
		return 2 * radius * pi;
	}
	
	double calculateArea(int count) {
		return calculateArea() * count;
	}
}
