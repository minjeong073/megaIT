package academy.java2.Abstract.test02;

public class Length extends ConvertUnits {

	public Length() {
		super("cm", "inch");
		
	}

	@Override
	public double convert() {
		return super.getConvertNumber() / 2.54;
	}
	
	@Override
	public void printUnits() {
		System.out.println(super.getConvertNumber() + super.getBeforeName()
				 + " -> " + this.convert() + super.getAfterName());
	}
	
}
