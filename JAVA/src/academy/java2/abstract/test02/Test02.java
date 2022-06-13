package academy.java2.Abstract.test02;

public class Test02 {

	public static void main(String[] args) {
		
		ConvertUnits[] units = new ConvertUnits[2];
		
		units[0] = new Temperature();
		units[1] = new Length();
		
		units[0].setConvertNumber(32);
		units[0].printUnits();
		
		units[0].setConvertNumber(14);
		units[0].printUnits();
		
		units[1].setConvertNumber(15);
		units[1].printUnits();
		
		units[1].setConvertNumber(100);
		units[1].printUnits();
	
	}
}
