package academy.java2.Class;

public class Test01 {
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		
		circle.radius = 8;
		
		System.out.println("원의 넓이 : " + circle.calculateArea() 
		+ "\n원의 둘레 : " + circle.calculateCircumference() 
		+ "\n원 25개 넓이 : " + circle.calculateArea(25));
		System.out.println();
		
		
		Product product = new Product();
		
		product.name = "새우깡";
		product.price = 1300;
		product.expiration = "2021-03-02";
		
		product.printInfo();
		System.out.println();
		
		System.out.println("제품 5개의 가격 : " + product.calculatePrice(5)
				+ "\n제품 13개의 가격 : " + product.calculatePrice(13));
		product.isAvailable("2021-04-03");
		
	}

}
