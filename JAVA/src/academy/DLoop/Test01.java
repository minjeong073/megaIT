package academy.DLoop;

public class Test01 {
	public static void main(String[] args) {
		
		System.out.println("1. 주사위 문제");
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("(" + i + ", " + j + ") ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("2. 구구단");
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
		System.out.println();
		
		
		System.out.println("3. 별찍기 1");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("4. 별찍기 2");
		for (int i = 0; i < 5; i++) {
			for (int j = 5-i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		System.out.println("5. 별찍기 3");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for (int j = 5-i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("6. 별찍기 4");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for (int j = 5-i; j < 5+(i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
