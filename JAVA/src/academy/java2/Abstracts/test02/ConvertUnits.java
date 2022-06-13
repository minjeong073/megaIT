package academy.java2.Abstract.test02;

public abstract class ConvertUnits {

	private String beforeName;
	private String afterName;
	private double convertNumber;

	public ConvertUnits(String beforeName, String afterName) {
		this.beforeName = beforeName;
		this.afterName = afterName;
	}
	
	public void setConvertNumber(double convertNumber) {
		this.convertNumber = convertNumber;
	}
	
	public double getConvertNumber() {
		return this.convertNumber;
	}
	
	public String getBeforeName() {
		return beforeName;
	}

	public String getAfterName() {
		return afterName;
	}

	public abstract double convert();
	
	public abstract void printUnits();
	
}
