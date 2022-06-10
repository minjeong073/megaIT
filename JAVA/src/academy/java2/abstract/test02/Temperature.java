package academy.java2.Abstract.test02;

public class Temperature extends ConvertUnits {

	public Temperature() {
		super("섭씨", "화씨");
	}

	@Override
	public double convert() {
		return 9 / 5 * super.getConvertNumber() + 32;
	}

	@Override
	public void printUnits() {
		System.out.println(super.getBeforeName() + " : " + super.getConvertNumber()
				+ " -> " + super.getAfterName() + " : " 
				+ this.convert());
		
	}
}
