package academy.java2.map.test07_2;

//import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		String input;
		
		Market market = new Market();

		market.create("시계", 100_000, "판매중");
		market.create("시계1", 100_000, "판매");
		market.create("시계", 100_000, "판매완료");
		
		market.read();
		
		market.update("시계", "예약중");
		
		market.read();
		
		market.delete("시계");
		
		market.read();
	}
}
