package academy.java2.inheritance.test03;

public class CalculateHealthInfo extends HealthInfo{

	private double standardWeight;
	private String bmi;
	
	public CalculateHealthInfo(String name, double height, double weight) {
		super(name, height, weight);
	}

	public double calculateStandardWeight() {
// 		this.standardWeight = (super.getHeight() - 100) * 0.9;
//		this.standardWeight = (super.height - 100) * 0.9;
		this.standardWeight = (this.height - 100) * 0.9;
		return this.standardWeight;
	}
	
	public String calculateBmi() {
// 		double bmiPercent = (super.getWeight() - this.standardWeight) 
// 				/ this.standardWeight * 100;
//		double bmiPercent = (super.weight - this.standardWeight) 
//				/ this.standardWeight * 100;
		double bmiPercent = (this.weight - calculateStandardWeight())
				/ calculateStandardWeight() * 100;
		
		if (bmiPercent < 10) {
			this.bmi = "정상";
		} else if (bmiPercent < 20) {
			this.bmi = "과체중";
		} else {
			this.bmi = "정상";
		}
		return this.bmi;
	}

	@Override
	public void showInfo() {
// 		System.out.println(super.getName() + "님의 신장 " + super.getHeight()
// 				+ ", 몸무게 " + super.getWeight() + "kg => " + this.bmi + "입니다.");
//		System.out.println(super.name + "님의 신장 " + super.height 
//				+ ", 몸무게" + super.weight + "kg => " + this.bmi + "입니다.");
		System.out.println(this.name + "님의 신장 " + this.height
				+ ", 몸무게" + this.weight + "님의 신장 " + "kg => " + calculateBmi() + "입니다.");

	}

}
