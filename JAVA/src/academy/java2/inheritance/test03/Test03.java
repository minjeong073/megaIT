package academy.java2.inheritance.test03;

public class Test03 {

	public static void main(String[] args) {
		
		CalculateHealthInfo calc = new CalculateHealthInfo("유재석", 178.3, 80);
		
		calc.calculateStandardWeight();
		calc.calculateBmi();
		
		calc.showInfo();
		
	}	
}
